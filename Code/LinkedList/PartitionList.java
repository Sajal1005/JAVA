package LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode temp1=a,temp2=b;
        while(head!=null){
            if(head.val<x){
                temp1.next=head;
                head=head.next;
                temp1=temp1.next;
            }else{
                temp2.next=head;
                head=head.next;
                temp2=temp2.next;
            }
        }
        temp1.next=b.next;

        // IMP LINE
        temp2.next=null;

        return a.next;

    }
}
