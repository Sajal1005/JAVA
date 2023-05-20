package LinkedList;

public class RemoveNthNodeFromEnd {
    ListNode temp = head;
    int count=0;
        while(temp!=null){
        temp=temp.next;
        count++;
    }
        if(count==n){return head.next;}
    count-=(n+1);
    temp=head;
        for(int i=0;i<count;i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
        return head;
}
