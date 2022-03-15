// class Solution {
//     public static ListNode reverse(ListNode head){
//             if(head==null||head.next==null)return head;
//             ListNode prev=null;
//             ListNode curr=head;
//             while(curr!=null){
//             ListNode forw=curr.next;
//                     curr.next=prev;
//                     prev=curr;
//                     curr=forw;
//             }
//             return prev;
//     }
// public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1==null||l2==null) return l1!=null?l1:l2;
//         ListNode c1=reverse(l1);
//         ListNode c2=reverse(l2);
//         ListNode ans=new ListNode(-1);
//         ListNode itr=ans;
//         int carry=0;
//         while(c1!=null||carry!=0||c2!=null){
//                 int sum=carry+(c1!=null?c1.val:0)+(c2!=null?c2.val:0);
//                 int digit=sum%10;
//                 carry=sum/10;
//                 itr.next=new ListNode(digit);
//                 itr=itr.next;
//                 if(c1!=null)c1=c1.next;
//                 if(c2!=null)c2=c2.next;      
//         }
       
       
//     return reverse(ans.next);
// }
// }