package OOPs.Overloading;
// In overloading Method resolution will always takes care by compiler based on Reference type.

class Animal {
    
}

class Dog extends Animal{

}

public class Case6 {
    
    public void m1(Animal a){
        System.out.println("Animal arg method");
    }

    public void m1(Dog a){
        System.out.println("Dog arg method");
    }

    public static void main(String[] args) {
        Case6 c = new Case6();

        Animal a = new Animal();
        Dog d = new Dog();

        // reference Type
        Animal obj = new Dog();

        c.m1(d); // dog objet

        c.m1(a); // animal

        c.m1(obj); // Animal
    }
}
