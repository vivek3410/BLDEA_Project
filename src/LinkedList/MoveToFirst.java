package LinkedList;

public class MoveToFirst {

    public static Node solution(Node head){
        // logic
        Node curr = head;

        if(head == null || head.link == null){
            return head;
        }

        // TC: O(n)
        while(curr.link.link != null){
            curr = curr.link;
        }

        Node last = curr.link;
        last.link = head;
        curr.link = null;


        return last;
    }
    
    public static void main(String[] args) {
        LinkedList list = LinkedList.userInput();


        Node result = solution(list.head);

        LinkedList.print(result);
    }
}
