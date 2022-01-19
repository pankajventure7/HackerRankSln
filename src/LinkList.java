public class LinkList {
    Node head;
    public class Node{
        int data;
        Node next;
        //Inner class is added (Linklist has node)
        public Node(int data){
            this.data=data;
            next=null;
        }
        //Inserting node
        public LinkList insertData(int data,LinkList list){
            Node new_node = new Node(data);
            new_node.next=null;
            if(list.head == null){
                list.head = new_node;
            }else {
                Node last = list.head;
                while (last != null){
                    last = last.next;
                }
                last = new_node;
            }
            return list;

        }
        //inset node at the head
        Node insertNodeAtHead(Node llist, int data) {

            Node temp;
            //Cheking if the node is empty
            if(llist == null){
                //allocating node and storing data to llist variable
                llist = new Node(data);
                return llist;
            }
            //if node is not empty, than storing data in a temp node
            temp = new Node(data);
            // storing the head next to temp;
            temp.next=llist;
            // storing temp at the head
            llist = temp;
            return llist;
        }

        Node insertNodeAtRandom(Node llist,int position,int data){
            if()
        }
    }
}
