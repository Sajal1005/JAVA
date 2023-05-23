package LinkedList;

public class MaximumTwinSum {
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head,prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode curr=slow,temp=null;
        prev=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        int ans=0;
        while(head!=null && prev!=null){
            ans=Math.max(ans,head.val+prev.val);
            head=head.next;
            prev=prev.next;
        }
        return ans;
    }
}
