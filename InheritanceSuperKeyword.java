class Animal{
    String color = "white";
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
    String color = "black";
    void eat(){
        System.out.println("Dog eating..");
    }
    void bark(){
        System.out.println("Barking....");
    }
    void work(){
        super.eat();
        bark();
    }
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class InheritanceSuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
        d.work();
    }
    
}
