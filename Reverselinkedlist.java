class Reverselinkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
        public
        static Node reverse(Node head) 
        {
            // code here
            Node prev = null;
            Node current = head;
            Node next = null;
            while(current!=null){
                next=current.next;
                current.next = prev;
                prev =current;
                current = next;
            }
            return prev;
        }
    }