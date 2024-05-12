class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("tuut,tuut..");
    } 
}
public class InheritanceEg extends Vehicle{
    public String ModelName = "Mustang";
    public static void main(String[] args) {
        InheritanceEg obj = new InheritanceEg();

        obj.honk();

        System.out.println(obj.brand+" "+obj.ModelName);
    }
    
}
