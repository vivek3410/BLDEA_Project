package LinkedList;

public class MiddleNode {

    // Hare and Tortoise Algorithm
    public static Node solution(Node head){
        // logic
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.link != null){
            slow = slow.link;
            fast = fast.link.link;
        }

        return slow;
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);


        list.print();

        Node result = solution(list.head);
        System.out.println(result.data);
    }
}
