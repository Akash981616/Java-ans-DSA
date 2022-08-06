import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * int
 */
public class inti {
    interface A {
        void show();

    }

    class B implements A {
        String name;

        B(String name) {
            this.name = name;
        }

        @Override
        public void show() {
            System.out.println("hey " + name);
        }

    }

    public static void main(String[] args) {

        int A[] = {
                3
                        - 72,
                72, 8 };
        //int A[] = { -72, 72, 8 };

        System.out.println(solve(A, A.length));

    }

    private static String solve(int[] A, int N) {
        int arr[] = new int[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += A[i];

            arr[i] = sum;
        }
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if (index % 2 == 0) {
                if (arr[i] != 0) {
                    System.out.println(index);
                    return "NO";
                }

            }
            index++;
        }
        return N % 2 == 0 && sum == 0 ? "YES" : "NO";
    }

    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int map[] = new int[128];
            int ei = 0, si = 0, len = 0;
            int count = 0;
            while (ei < s.length()) {
                if (map[s.charAt(ei++)]++ > 0)
                    count++;
                while (count > 0)
                    if (map[s.charAt(si++)]++ > 1)
                        count--;
                len = Math.max(len, ei - si);

            }
            return len;
        }
    }

    class NumberContainers {

        TreeMap<Integer, Integer> map;

        public NumberContainers() {
            map = new TreeMap<>();

        }

        public void change(int index, int number) {
            map.put(index, number);

        }

        public int find(int number) {
            int val = -1;
            for (int key : map.keySet()) {
                if (map.get(key) == number) {
                    return map.get(key);
                }
            }
            return val;
        }
    }

    class Solution {
        class TreeNode {
            int val;
            int count = 1;
            TreeNode left;
            TreeNode right;

            TreeNode(int val) {
                this.val = val;

            }
        }

        public class Solution {
            public List<Integer> countSmaller(int[] nums) {
                List<Integer> res = new ArrayList<>();
                if (nums == null || nums.length == 0)
                    return res;
                TreeNode root = new TreeNode(nums[nums.length - 1]);
                res.add(0);
                for (int i = nums.length - 2; i >= 0; i--) {
                    int count = insertNode(root, nums[i]);
                    res.add(count);
                }
                Collections.reverse(res);
                return res;
            }

            public int insertNode(TreeNode root, int val) {
                int thisCount = 0;
                while (true) {
                    if (val <= root.val) {
                        root.count++;
                        if (root.left == null) {
                            root.left = new TreeNode(val);
                            break;
                        } else {
                            root = root.left;
                        }
                    } else {
                        thisCount += root.count;
                        if (root.right == null) {
                            root.right = new TreeNode(val);
                            break;
                        } else {
                            root = root.right;
                        }
                    }
                }
                return thisCount;
            }
        }
    }

    public class Solution {
        public List<Integer> countSmaller(int[] nums) {
            List<Integer> res = new LinkedList<Integer>();
            if (nums == null || nums.length == 0) {
                return res;
            }
            // find min value and minus min by each elements, plus 1 to avoid 0 element
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                min = (nums[i] < min) ? nums[i] : min;
            }
            int[] nums2 = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                nums2[i] = nums[i] - min + 1;
                max = Math.max(nums2[i], max);
            }
            int[] tree = new int[max + 1];
            for (int i = nums2.length - 1; i >= 0; i--) {
                res.add(0, get(nums2[i] - 1, tree));
                update(nums2[i], tree);
            }
            return res;
        }

        private int get(int i, int[] tree) {
            int num = 0;
            while (i > 0) {
                num += tree[i];
                i -= i & (-i);
            }
            return num;
        }

        private void update(int i, int[] tree) {
            while (i < tree.length) {
                tree[i]++;
                i += i & (-i);
            }
        }
    }
 class FoodRatings {
        HashMap<String, PriorityQueue<Food>> x = new HashMap<>(); // get pq from cuisine name
        HashMap<String, Food> menu = new HashMap<>(); // get Food (object) from food name

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            for (int i = 0; i < foods.length; i++) {
                Food curr = new Food(foods[i], cuisines[i], ratings[i]);
                x.putIfAbsent(cuisines[i], new PriorityQueue<>(
                        (a, b) -> b.rating == a.rating ? a.name.compareTo(b.name) : b.rating - a.rating));
                PriorityQueue<Food> pq = x.get(cuisines[i]);
                pq.add(curr);
                menu.put(foods[i], curr);
            }
        }

        public void changeRating(String food, int newRating) {
            Food curr = menu.get(food);
            PriorityQueue<Food> pq = x.get(curr.cuisine);
            pq.remove(curr);
            curr.rating = newRating;
            pq.add(curr);
        }
        

        public String highestRated(String cuisine) {
            return x.get(cuisine).peek().name;
        }

        class Food {
            int rating;
            String name, cuisine;

            Food(String name, String cuisine, int rating) {
                this.name = name;
                this.cuisine = cuisine;
                this.rating = rating;
            }

        }
    }

}





