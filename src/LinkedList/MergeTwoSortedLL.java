package LinkedList;

public class MergeTwoSortedLL {

    public static Node solution(Node l1,Node l2){
        Node result = new Node(-1);
        Node temp = result;

        while(l1 != null && l2 != null){
            if(l1.data < l2.data){
                temp.link = l1;
                l1 = l1.link;
            }else{
                temp.link = l2;
                l2 = l2.link;
            }

            temp = temp.link;
        }

        if(l1 != null){
            temp.link = l1;
        }

        if(l2 != null){
            temp.link = l2;
        }

//         while(l1 != null){
//             temp.link = l1;
//             l1 = l1.link;
//             temp = temp.link;
//         }
// 
//         while(l2 != null){
//             temp.link = l2;
//             l2 = l2.link;
//             temp = temp.link;
//         }

        return result.link;
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
        LinkedList l1 = new LinkedList();
        l1.insert(3);
        l1.insert(7);
        l1.insert(10);

        l1.print();

        LinkedList l2 = new LinkedList();
        l2.insert(2);
        l2.insert(5);
        l2.insert(8);
        l2.insert(12);
        l2.insert(13);
        l2.insert(14);
        l2.insert(16);
        l2.insert(18);



        l2.print();

        Node result = solution(l1.head, l2.head);

        print(result);

    }
}
