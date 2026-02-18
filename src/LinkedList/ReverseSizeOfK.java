package LinkedList;

public class ReverseSizeOfK {

    public static Node getKthNode(Node head,int k){
        k = k - 1;
        Node temp = head;
        while(temp != null && k > 0){
            k--;
            temp = temp.link;
        }

        return temp;
    }

    public static void reverse(Node head){
        Node temp = head;
        Node prev = null;
        Node next = head;

        while(temp != null){
            next = temp.link;
            temp.link = prev;
            prev = temp;
            temp = next;
        }
    }

    public static Node solution(Node head,int k){
        Node temp = head;
        Node prevNode = null;

        while(temp != null){
            // 1. finding kth node
            Node kthNode = getKthNode(temp, k);
            
            if(kthNode == null){
                if(prevNode != null){
                    prevNode.link = temp;
                }
                break;
            }

            // 2. Presering nextNode before breaking
            Node nextNode = kthNode.link;
            // 3. breaking the list of size of k
            kthNode.link = null;

            // 4. reversing temp to kthnode
            reverse(temp);

            // 5. if it is first occurance
            if(temp == head){
                head = kthNode;
            }else{
                // 6. Linking the prev with kthnode
                prevNode.link = kthNode;
            }


            prevNode = temp;
            temp = nextNode;
        }

        return head;
    }

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.link;
        }

        System.out.println();
    }
    

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.insert(9);
        list.insert(10);
        print(list.head);

        Node result = solution(list.head, 3);

        print(result);


    }
}
