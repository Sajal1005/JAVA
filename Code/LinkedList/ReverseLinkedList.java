package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null,temp=null,curr=head;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
