package LinkedList;

public class MergeKSortedLists {
    public ListNode merge(ListNode l1,ListNode l2){
        if(l1==null){return l2;}
        if(l2==null){return l1;}
        ListNode ans = new ListNode(-1);
        ListNode temp=ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }else{
                temp.next=l2;
                l2=l2.next;
                temp=temp.next;
            }
        }
        if(l1!=null){
            temp.next=l1;
        }else{
            temp.next=l2;
        }
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] list) {
        if(list.length==0){return null;}
        if(list.length==1){return list[0];}
        ListNode merged = merge(list[0],list[1]);
        for(int i=2;i<list.length;i++){
            merged=merge(merged,list[i]);
        }
        return merged;
    }
}
