package LinkedList;

public class CircularLL {

    Node head;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            newNode.link = head;
            return;
        }

        Node curr = head;

        while(curr.link != head){
            curr = curr.link;
        }

        curr.link = newNode;
        newNode.link = head;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);

        Node curr = head;

        if(head == null){
            head = newNode;
            newNode.link = head;
            return;
        }

        while(curr.link != head){
            curr = curr.link;
        }

        newNode.link = head;
        head = newNode;
        curr.link = head;
    }

    public void print(){
        Node curr = head;

        do{
            System.out.print(curr.data + " -> ");
            curr = curr.link;
        }while(curr != head);

        System.out.println(head.data);
    }
    

    public static void main(String[] args) {
        CircularLL cList = new CircularLL();

        cList.insertAtEnd(1);
        cList.insertAtEnd(2);
        cList.insertAtFirst(10);

        cList.print();

        
    }
}
