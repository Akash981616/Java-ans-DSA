
import java.util.*;

/**
 * WordLadder2
 */
public class WordLadder2 {
    public static void main(String[] args) {
        int arr[] = { 1, 10, 2, 9 };
        int n = arr.length;
        System.out.println(findMedian(arr, n));

    }

    private static int findMedian(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int maxFrequency = 0;
        for (int elem : map.keySet

        ()) {
            if (map.get(elem) > maxFrequency) {
                maxFrequency = map.get(elem);
            }
        }
        System.out.println(maxFrequency + " fdaslfjaslkdfjklasdfjklasd");
        return (n - maxFrequency);

    }

    class Solution {
        Set<String> set = new HashSet<>();
        Map<String, Integer> dist = new HashMap<>();
        String beginWord, endWord;
        List<List<String>> res;

        public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
            set = new HashSet<>(wordList);
            this.beginWord = beginWord;
            this.endWord = endWord;
            res = new ArrayList<>();
            shortPath();
            if (dist.get(endWord) == null)
                return res;
            List<String> path = new ArrayList<>();
            path.add(endWord);
            dfs(endWord, path);
            return res;

        }

        private void dfs(String word, List<String> path) {
            if (word.equals(beginWord)) {
                List<String> list = new ArrayList<>(path);
                Collections.reverse(list);
                res.add(list);
                return;
            }
            char ch[] = word.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                char c = ch[i];
                for (char j = 'a'; j <= 'z'; j++) {
                    ch[i] = j;
                    String check = new String(ch);
                    if (dist.get(check) != null && dist.get(check) + 1 == dist.get(word)) {

                        path.add(check);
                        dfs(check, path);
                        path.remove(path.size() - 1);

                    }

                }
                ch[i] = c;
            }

        }

        private void shortPath() {
            Queue<String> q = new LinkedList<>();
            q.add(beginWord);
            dist.put(beginWord, 0);
            while (q.size() > 0) {
                String curr = q.remove();
                if (curr.equals(endWord))
                    break;
                char ch[] = curr.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    char c = ch[i];
                    for (char j = 'a'; j <= 'z'; j++) {
                        ch[i] = j;
                        String check = new String(ch);
                        if (set.contains(check) && dist.get(check) == null) {
                            dist.put(check, dist.get(curr) + 1);
                            q.offer(check);

                        }

                    }
                    ch[i] = c;
                }

            }
        }

    }

}


class Solution {
    public String smallestNumber(String pattern) {
        int number = 1;
        Stack<Integer> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (char c : pattern.toCharArray()) {
            if (c == 'D') {
                stack.add(number++);

            } else {
                stack.add(number++);
                while (!stack.isEmpty())
                    ans.append(stack.pop());
            }
        }
        stack.add(number);
        while (!stack.isEmpty())
            ans.append(stack.pop());
        return ans.toString();
    }
}





