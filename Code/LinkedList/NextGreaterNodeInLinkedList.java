package LinkedList;

public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int[] ans = new int[count];
        int j=0;
        temp=head;
        while(temp!=null){
            ListNode temp2=temp.next;
            int flag=0;
            while(temp2!=null){
                if(temp2.val>temp.val){
                    ans[j++]=temp2.val;
                    flag=1;
                    break;
                }
                temp2=temp2.next;
            }
            if(flag==0){
                ans[j++]=0;
            }
            temp=temp.next;
        }
        return ans;
    }
}
