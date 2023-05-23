package LinkedList;

public class SwappingNodesOfLinkedList {
    public ListNode swapNodes(ListNode head, int k) {
        int n=k,count=0;
        ListNode temp=head,temp2=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        temp=head;
        while((--k)>0){
            temp=temp.next;
        }
        for(int i=0;i<count-n;i++){
            temp2=temp2.next;
        }
        int t = temp.val;
        temp.val=temp2.val;
        temp2.val=t;
        return head;
    }
}
