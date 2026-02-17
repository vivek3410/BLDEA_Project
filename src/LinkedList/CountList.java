package LinkedList;

public class CountList {

    // 1. counting
    public static int solution(LinkedList list){
        Node curr = list.head;
        int count = 1;
        while(curr.link != null){
            curr = curr.link;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(10);
        list.insert(10);
        list.insert(10);

        System.out.println("Total Nodes: "+solution(list));

    }
}
