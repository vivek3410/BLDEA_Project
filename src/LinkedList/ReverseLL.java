package LinkedList;

public class ReverseLL {

    public static Node solution(Node head){
        Node temp = head;
        Node next = head;
        Node prev = null;

        while(temp != null){
            next = temp.link;
            temp.link = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }

        System.out.println("null");
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(7);
        list.insert(10);

        list.print();

        Node result = solution(list.head);

        print(result);

    }
}
