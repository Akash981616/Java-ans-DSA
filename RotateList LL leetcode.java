// https://leetcode.com/problems/reverse-linked-list-ii/
// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {
//                 ListNode dummy=new ListNode(-1);
//                 dummy.next=head;
//                 ListNode prev=dummy;
//                 ListNode curr=head;
//            for(int i=0;i<left-1;i++){
//                    curr=curr.next;
//                    prev=prev.next;
//                    System.out.println(i);
                   
//            }
            
//             ListNode node=prev;
//             for(int i=0;i<right-left;i++){
//                    ListNode current = curr.next;
//                     System.out.println(curr.next.val+"-> "+current.next.val);
//             curr.next = current.next;
//                     System.out.println(curr.next.val+"-> "+prev.next.val);
//             current.next = prev.next;
//                     System.out.println(prev.next.val+"-> "+prev.next.val);
//             prev.next = current;
                    
//             }
            
           
//             return dummy.next;
//     }
        
// }