package LinkedList;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode l = left,r=right;
        int count=0;
        while(head!=null){
            if(count%2!=0){
                r.next=head;
                head=head.next;
                r=r.next;
            }else{
                l.next=head;
                head=head.next;
                l=l.next;
            }
            count++;
        }
        l.next=right.next;
        r.next=null;
        return left.next;
    }
}
