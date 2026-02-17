package LinkedList;

public class FindKthNode {

    public static Node solution(Node head,int k){
        k = k - 1;
        Node temp = head;

        while(temp != null && k > 0){
            k--;
            temp = temp.link;
        }

        return temp;
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.print();

        Node result = solution(list.head,1);
        // result?.data
        System.out.println(result == null ? "null" : result.data);
    }
}
