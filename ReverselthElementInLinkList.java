// import java.util.*;

// class Main {
//     public static Scanner scn = new Scanner(System.in);

//     public static class ListNode {
//         int val = 0;
//         ListNode next = null;

//         ListNode(int val) {
//             this.val = val;
//         }
//     }

//     static ListNode tt = null;
//     static ListNode th = null;

//     public static void addFirst(ListNode node) {
//         if (th == null) {
//             th = node;
//             tt = node;
//         } else {
//             node.next = th;
//             th = node;
//         }
//     }

//     public static int length(ListNode node) {
//         int len = 0;
//         while (node != null) {
//             node = node.next;
//             len++;
//         }
//         return len;
//     }

//     public static ListNode reverseInKGroup(ListNode head, int k) {
//         if (head == null || head.next == null || k <= 1)
//             return head;

//         int len = length(head);

//         ListNode oh = null;
//         ListNode ot = null;
//         ListNode curr = head;

//         while (curr != null && len >= k) {
//             int tempK = k;
//             while (tempK-- > 0) {
//                 ListNode forw = curr.next;

//                 curr.next = null;
//                 addFirst(curr);

//                 curr = forw;
//             }

//             len -= k;
//             if (oh == null) {
//                 oh = th;
//                 ot = tt;
//             } else {
//                 ot.next = th;
//                 ot = tt;
//             }

//             th = null;
//             tt = null;
//         }

//         ot.next = curr;
//         return oh;
//     }

//     public static void printList(ListNode node) {
//         while (node != null) {
//             System.out.print(node.val + " ");
//             node = node.next;
//         }
//     }

//     public static ListNode createList(int n) {
//         ListNode dummy = new ListNode(-1);
//         ListNode prev = dummy;
//         while (n-- > 0) {
//             prev.next = new ListNode(scn.nextInt());
//             prev = prev.next;
//         }

//         return dummy.next;
//     }

//     public static void main(String[] args) {
//         int n = scn.nextInt();
//         ListNode h1 = createList(n);

//         int k = scn.nextInt();
//         h1 = reverseInKGroup(h1, k);
//         printList(h1);
//     }
// }
                                
                                
                                
import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    static ListNode tt = null;
    static ListNode th = null;

    static int length(ListNode node){
        int size=0;
        while(node!=null){
                node=node.next;
                size++;
        }
        return size;
}
                static ListNode prev=null;
                static ListNode currr= null;
                public static ListNode reverse(ListNode head,int count){
                        ListNode currr= head;
                        while(count>0){
                                ListNode temp=currr.next;
                                currr.next=prev;
                                prev.next=currr;
                                currr=temp;
                                count--;
                        }
                        return prev;
        }
    public static ListNode reverseInKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) return head;
        ListNode curr=head;
        int len = length(head);
        ListNode oh=null;
        ListNode ot=null;
                while (k<len&&curr!=null) {
                        int tempk=3;
                      ListNode res=reverse(curr,tempk);
                      len=len-k;
                      prev=null;
                      curr=null;
                      if(oh==null){
                              oh=res;
                              ot=res;

                      }else{
                              oh.next=res;
                              ot=res;
                      }
                      oh.next=curr;

                      
                }
        oh.next=curr;
        return oh;

       
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);

        int k = scn.nextInt();
        h1 = reverseInKGroup(h1, k);
        printList(h1);
    }
}
                                
                                
                                