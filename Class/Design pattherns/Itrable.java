import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Itrable {
    static class MyLinkedList {
        static class TreeNode {
            int val;
            TreeNode next;

            TreeNode(int val) {
                this.val = val;
            }
        }

        TreeNode head;
        TreeNode tail;
        int size = 0;

        class Node {
            int val;
            Node left;
            Node right;

            Node(int val, Node left, Node right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }
      
        void addFirst(int val) {
            TreeNode temp = new TreeNode(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
            size++;

        }
            /**
             * @return
             */
            public Iterator<Integer> iterator() {
        return new MyLinkedListItr<Integer>(head); 
}
    }


    static class MyLinkedListItr implements Iterator<Integer> {

    }
  //63313388 63313388 63313388
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a & b);
        System.out.print(a | b);
            
    }

    class Solution {
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
            List<List<Integer>> res = new ArrayList<>();
            HashMap<Integer> map = new HashMap<>();

            for (int[] e : items1)
                map.put(e[0], e[1]);

            for (int[] e : items2) {
                if (map.containsKey(e[0])) {
                    map.put(e[0], map.getOr(e[0]) + e[1]);
                }
            }
            for (int key : map.keySet()) {
                List<Integer> curr = new ArrayList<>();
                curr.add(key);
                curr.add(map.get(key));
                res.add(curr);
            }
            Comparator<List<String>> comparator = new Comparator<List<String>>() {
    public int compare(List<String> pList1, List<String> pList2) {
        return pList1.get(0).compareTo(pList2.get(0));
    }
};
            return Collections.sort(res,comparator); 
        }
    }

}

