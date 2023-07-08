package LinkedList;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        Node temp = head;
        while(temp!=null){
            Node newn = new Node(temp.val);
            newn.next=temp.next;
            temp.next=newn;
            temp=newn.next;
        }

        temp=head;
        while(temp!=null){
            if(temp.random!=null){
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        temp=head;
        Node ans = new Node(-1);
        Node copy=ans;
        while(temp!=null){
            Node front=temp.next.next;
            copy.next=temp.next;
            copy=copy.next;
            temp.next=front;
            temp=front;
        }
        return ans.next;
    }
}
