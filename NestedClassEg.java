class Class1{
    int x = 10;

    class Class2{
        int y = 50;
    }
}
public class NestedClassEg {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        Class1.Class2 c2 = c1.new Class2();
        System.out.println(c1.x +" "+c2.y);
    }
}