// https://leetcode.com/problems/palindrome-linked-list/
// public class PalindromeLinkedList {
//     *     ListNode next;
//     *     ListNode() {}
//     *     ListNode(int val) { this.val = val; }
//     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//     * }
//     */
//            class Solution {
//        // FirstSolution
//        // public boolean isPalindrome(ListNode head) {
//        //     if(head == null) return true;   
//        //     ListNode node = head;   //node points at front
//        //   boolean bool=isPalindrome(head.next);
//        //         if(node.val==head.val){
//        //                 node=node.next;
//        //         }else{
//        //                 bool=false;
//        //         }return true;
//        //         }       
      
//        public boolean isPalindrome(ListNode head) {
          
//                  if(head==null||head.next==null) return true;
               
//                   ListNode mid=midLL(head);
//                   ListNode newHead=mid.next;
//                    mid.next=null;
//                   newHead=reverse(newHead);
//                    boolean res=true;
//                    while(newHead!=null&&head!=null){
//                            if(newHead.val!=head.val){
//                                    res=false;
//                                    break;
                                   
//                            }
//                            newHead=newHead.next;
//                            head=head.next;
//                            }
//                    return res;
                   
//            }
   
               
//            public static ListNode reverse(ListNode head){
//                   ListNode prev=null;
//                    ListNode curr=head;
//                    while(curr!=null){
//                            ListNode forr=curr.next;
//                            curr.next=prev;
//                            prev=curr;
//                            curr=forr;
                           
//                    }
//                    return prev;
//                    }  
//                     public static ListNode midLL(ListNode head){
//                             ListNode fast=head;
//                             ListNode slow=head;
//                            while(fast.next!=null&&fast.next.next!=null){
//                            fast=fast.next.next;
//                            slow=slow.next;
//                    }
                          
//                    return slow;
//                    }
//            }
     
// }
