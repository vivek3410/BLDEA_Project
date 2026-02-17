package LinkedList;

public class Demo {
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(50);

        list.insert(30,3);
        list.print();
        
        list.delete(5);
        list.print();

    }
}
