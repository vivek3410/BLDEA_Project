package LinkedList;

public class LinkedList {

    Node head;

    // 1. Insertion (at first and end)
    // TC: Best Case: o(1) WC: O(n)
    public void insert(int data){
        // Empty Node (At first)
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        // At End
        Node curr = head;
        while(curr.link != null){
            curr = curr.link;
        }

        curr.link = newNode;
    }


    // 3. Insertion (at specified position)
    // TC: Best: O(1) Specified: O(k) Worst: O(n)
    public void insert(int data,int pos){
        Node newNode = new Node(data);
        // At First
        if(pos == 1){
            newNode.link = head;
            head = newNode;
            return;
        }

        // At specfied Postion
        Node curr = head;
        int count = 1;
        while(curr.link != null && count < pos - 1){
            curr = curr.link;
            count++;
        }

        // Exceeds the position
        if(curr.link == null) {
            System.out.println("Pos invalid");
            return;
        }

        Node next = curr.link;
        curr.link = newNode;
        newNode.link = next;
    }

    // TC: O(n)
    // 4. Print (Travrsal)
    public void print(){
        Node curr = head;


        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.link;
        }

        System.out.println("null");
    }



    // 5. Deletion
    // at end
    // at specfied postion
    // Best:O(1) worst: O(n)
    public void delete(int pos){
        if(pos == 1){
            head = head.link;
            return;
        }

        Node curr = head;
        int count = 1;
        while(curr.link != null && count < pos - 1){
            curr = curr.link;
            count++;
        }

        if(curr.link == null){
            System.out.println("Unable to delete");
            return;
        }

        curr.link = curr.link.link;
    }

    
}

