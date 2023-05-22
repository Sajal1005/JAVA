package LinkedList;

public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head, prev = null, temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        int min = prev.val;
        curr = prev;
        while (prev != null && prev.next != null) {
            if (prev.next.val < min) {
                prev.next = prev.next.next;
            } else {
                min = prev.next.val;
                prev = prev.next;
            }
        }
        prev = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
