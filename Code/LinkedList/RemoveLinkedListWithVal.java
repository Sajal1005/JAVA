package LinkedList;

public class RemoveLinkedListWithVal {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(-1);
        ans.next=head;
        ListNode temp=ans;
        while(temp!=null && temp.next!=null){
            if(val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return ans.next;
    }
}
