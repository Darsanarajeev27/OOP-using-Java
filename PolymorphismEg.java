import java.util.*;
abstract class Shapes{
    abstract void numberOfSides();
}
class Rectangle extends Shapes{
    void numberOfSides(){
        System.out.println("No of sides in rectangle is: 4");
    }
}
class Triangle extends Shapes{
    void numberOfSides(){
        System.out.println("No of sides in triangle is: 3");
    }
}
class Hexagon extends Shapes{
    void numberOfSides(){
        System.out.println("No of sides in hexagon is: 6");
    }
}
public class PolymorphismEg {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Hexagon h = new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();

    }
    
}
