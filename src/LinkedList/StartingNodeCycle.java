package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class StartingNodeCycle {

    public static Node solution1(Node head){
        Node slow = head;
        Node fast = head;
        Node ptr = head;

        while(fast != null && fast.link != null){
            fast = fast.link.link;
            slow = slow.link;

            if(fast == slow){
                while(ptr != slow){
                    ptr = ptr.link;
                    slow = slow.link;
                }
                return ptr;
            }
        }

        return null;
    }
    

    public static Node solution2(Node head){
        Set<Node> set = new HashSet<>();

        Node curr = head;

        while(curr != null){

            if(set.contains(curr)){
                return curr;
            }

            set.add(curr);
            curr = curr.link;
        }

        return null;
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

        LinkedList list = LinkedList.userInput();

        Node result = solution2(list.head);

        if(result != null){
            System.out.println(result.data);
        }

        // print(result);
        

    }
}
