package .vscode;

/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
           
        Node curr=head;
            while(curr!=null){
                    if(curr.child==null){
                            curr=curr.next;
                            continue;
                    }
                    Node tempchild=curr.child;
                    while(tempchild.next!=null) tempchild=tempchild.next;
                    tempchild.next=curr.next;
                    if(curr.next!=null)curr.next.prev=tempchild;
                            curr.next=curr.child;
                            curr.child.prev=curr;
                            curr.child=null;
                    
            }
            return head;
    }
}