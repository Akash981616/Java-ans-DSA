import java.io.*;
    import java.util.*;
public class LL {
    
    
      public static class Node {
        public Node(int val) {
        }
        int data;
        Node next;
      }
    
      public static class LinkedList {
        Node head;
        Node tail;
        int size;
    
        void addFirst(int val) {
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(size==0){
            tail=head;
        }
        size++;
        }
        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"->");
                temp=temp.next;

            }

        };
      }
    
      
      public static void main(String[] args) throws Exception {
            Scanner scn =new Scanner(System.in);  
                  LinkedList list = new LinkedList();
            int val =scn.nextInt();
            list.addFirst(val);
        
}}