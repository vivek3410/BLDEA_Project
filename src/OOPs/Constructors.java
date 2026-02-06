package OOPs;

class Person{
    private String name;
    private String gender;
    private long phone;

    Person(String name,String gender,int phone){
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    Person(String name){

    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return this.name  + " " + this.gender + " " + this.phone;
    }


}

public class Constructors {

    public static void main(String[] args) {
        Person p1 = new Person("vivek","male",1234848585);

        System.out.println(p1);
    }
}
