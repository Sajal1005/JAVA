package LinkedList;
import java.util.*;

//class Node {
//    Node prev, next;
//    int key,val;
//    Node(int _key,int _value) {
//        key = _key;
//        val=_value;
//    }
//}
//
//class LRUCache {
//
//    HashMap<Integer,Node> m = new HashMap<>();
//    int size;
//    Node head = new Node(-1,-1);Node tail = new Node(-1,-1);
//
//
//    public LRUCache(int capacity) {
//        size=capacity;
//        head.next=tail;
//        tail.prev=head;
//    }
//
//    void addNode(int key,int val){
//        Node newn = new Node(key,val);
//        newn.prev=head;
//        head.next.prev=newn;
//        newn.next=head.next;
//        head.next=newn;
//        m.put(key,newn);
//    }
//
//    void delNode(Node node){
//        node.prev.next=node.next;
//        node.next.prev=node.prev;
//        m.remove(node.key);
//    }
//
//    public int get(int key) {
//        if(m.containsKey(key)){
//            Node temp = m.get(key);
//            delNode(temp);
//            addNode(temp.key,temp.val);
//            return m.get(key).val;
//        }else{
//            return -1;
//        }
//    }
//
//    public void put(int key, int value) {
//        if(m.containsKey(key)){
//            delNode(m.get(key));
//            addNode(key,value);
//            return;
//        }
//        if(m.size()+1>size){
//            delNode(tail.prev);
//        }
//        addNode(key,value);
//    }
//}

