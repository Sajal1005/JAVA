package LinkedList;

//class Node{
//    int data;
//    Node next,prev;
//    Node(int x){
//        this.data=x;
//        this.prev=null;
//        this.next=null;
//    }
//}

//public class DoublyLLRemoveDuplicates {
//    Node removeDuplicates(Node head){
//        // Code Here.
//        Node temp=head;
//        while(temp!=null && temp.next!=null){
//            if(temp.data==temp.next.data){
//                temp.next=temp.next.next;
//                if(temp.next!=null){
//                    Node ahead = temp.next;
//                    ahead.prev=temp;
//                }
//            }else{
//                temp=temp.next;
//            }
//        }
//        return head;
//    }
//}
