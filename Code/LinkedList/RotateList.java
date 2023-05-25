package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp = head;
        int length=1;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;
        k=k%length;
        k=length-k;
        while((k--)>0){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
