package LinkedList;

public class DeleteCycle{

    public static Node solution1(Node head){
        Node slow = head;
        Node fast = head;

        Node prev = null;
        Node ptr = head;

        while(fast != null && fast.link != null){
            fast = fast.link.link;
            prev = slow;
            slow = slow.link;

            if(fast == slow){
                while(ptr != slow){
                    ptr = ptr.link;
                    prev = slow;
                    slow = slow.link;
                }

                prev.link = null;

                return head;
            }
        }

        return head;
    }

    public static void print(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            
            curr = curr.link;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.link = new Node(2);
        head.link.link = new Node(3);
        head.link.link.link = new Node(4);
        head.link.link.link.link = new Node(5);
        head.link.link.link.link.link = new Node(6);
        head.link.link.link.link.link.link = new Node(7);
        head.link.link.link.link.link.link.link = new Node(8);
        head.link.link.link.link.link.link.link.link = head.link.link;

        // print(head);

        // LinkedList list = LinkedList.userInput();

        Node result = solution1(head);

        // print(result);
        

    }
}