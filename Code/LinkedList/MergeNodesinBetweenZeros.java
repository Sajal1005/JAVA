package LinkedList;

public class MergeNodesinBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(-1);
        ListNode tail=ans;
        ListNode temp = head;
        int sum=0;
        temp=temp.next;
        while(temp!=null){
            if(temp.val==0){
                ListNode newn = new ListNode(sum);
                tail.next=newn;
                tail=tail.next;
                sum=0;
            }else{
                sum+=temp.val;
            }
            temp=temp.next;
        }
        return ans.next;
    }
}
