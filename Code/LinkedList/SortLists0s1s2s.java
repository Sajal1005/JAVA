package LinkedList;

public class SortLists0s1s2s {
    public static Node sortList(Node head) {
        // Write your code here
        Node head0 = new Node(-1);
        Node head1 = new Node(-1);
        Node head2 = new Node(-1);
        Node l0=head0,l1=head1,l2=head2;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                l0.next=temp;
                temp=temp.next;
                l0=l0.next;
            }else if(temp.data==1){
                l1.next=temp;
                temp=temp.next;
                l1=l1.next;
            }else if(temp.data==2){
                l2.next=temp;
                temp=temp.next;
                l2=l2.next;
            }
        }
        if(l1!=head1){
            l0.next=head1.next;
            l1.next=head2.next;
        }else{
            l0.next=head2.next;
        }
        l2.next=null;
        return head0.next;
    }
}
