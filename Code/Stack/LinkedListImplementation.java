package Stack;

public class LinkedListImplementation {
    class LinkedListNode
    {
        int data;
        LinkedListNode next;

        LinkedListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public class Stack
    {
        LinkedListNode top=null;
        int count=0;

        public Stack()
        {
        }

        public int getSize()
        {
            return count;
        }

        public boolean isEmpty()
        {
            if(top==null){
                return true;
            }
            return false;
        }

        public void push(int data)
        {
            LinkedListNode newn = new LinkedListNode(data);
            newn.next=top;
            top=newn;
            count++;
        }

        public void pop()
        {
            if(top==null){
                return;
            }
            LinkedListNode temp=top;
            top=top.next;
            temp.next=null;
            count--;
        }

        public int getTop()
        {
            if(top==null){
                return -1;
            }
            return top.data;
        }
    }
}
