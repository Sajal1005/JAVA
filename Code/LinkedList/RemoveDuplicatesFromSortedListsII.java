package LinkedList;

public class RemoveDuplicatesFromSortedListsII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){return head;}
        ListNode ans = new ListNode(-1);
        ans.next=head;
        ListNode temp = head,prev=ans;
        while(temp!=null && temp.next!=null){
            if(temp.val==temp.next.val){
                int n=temp.val;
                while(temp!=null && temp.val==n){
                    temp=temp.next;
                }
                prev.next=temp;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return ans.next;
    }
}
