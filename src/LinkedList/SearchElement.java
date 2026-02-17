package LinkedList;

public class SearchElement {

    public static boolean solution(Node head,int target){
        // logic
        Node temp = head;

        while(temp != null){
            if(temp.data == target){
                return true;
            }
            
            temp = temp.link;
        }

        // for(;temp != null;temp = temp.link){
        //     if(temp.data == target){
        //         return true;
        //     }
        // }

        
        return false;
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

        if(solution(list.head,10)){
            System.out.println("present");
        }else{
            System.out.println("Not present");
        }
    }
}
