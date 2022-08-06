import java.util.Iterator;
import java.util.ListIterator;

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
}

