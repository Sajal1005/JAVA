package LinkedList;

public class RemoveCycle {
    public ListNode removeCycle(ListNode head) {
        ListNode slow=head,fast=head;
        int flag=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return null;
        }
        if(slow==head){
            while(fast.next!=slow){
                fast=fast.next;
            }
        }else{
            slow=head;
            while(slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
            }
        }
        fast.next=null;
        return head;
    }
}
