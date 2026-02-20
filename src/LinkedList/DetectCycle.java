package LinkedList;

public class DetectCycle {

    public static boolean solution(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.link != null){
            fast = fast.link.link;
            slow = slow.link;

            if(slow == fast){
                return true;
            }
        }

        return false;
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

        LinkedList list = LinkedList.userInput();

        System.out.println(solution(list.head));
    
    }
}
