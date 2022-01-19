import java.util.PrimitiveIterator;

public class Solution {
    public   Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }

        public static Solution insert_data(Solution node,int data){
            Node new_data = new Node(data);
            new_data.next = null;

            if(node.head==null){
                node.head = new_data;
            }else {
                Node last = node.head;
                while (last.next !=null){
                    last= last.next;
                }
                last.next = new_data;
            }
            return node;
        }
        public static void printList(Solution list){
            Node current = list.head;

        }

    }

    public static void main(String[] args) {

    }
}