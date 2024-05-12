abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("zzz...");
    } 
}
class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says: wee, wee..");
    }
}
public class AbstractClassEg {
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.sleep();
    }
}
