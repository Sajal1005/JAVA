package LinkedList;

public class AddTwoNumbersII {
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,temp=null;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode ans = new ListNode(-1);
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode temp=ans;
        int carry=0;
        while(t2!=null || t1!=null){
            int sum=carry;
            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            ListNode newn = new ListNode(sum%10);
            carry=sum/10;
            temp.next=newn;
            temp=temp.next;
        }
        if(carry>0){
            ListNode newn = new ListNode(carry);
            temp.next=newn;
        }
        return reverse(ans.next);
    }
}
