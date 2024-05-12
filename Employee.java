class EmployeeDemo{
    String Name;
    int age;
    long number;
    String address;
    int salary;
    public void print_salary(){
        System.out.println("Salary:"+salary+"\n");
    }
}
class Officer extends EmployeeDemo{
    String Designation;
    Officer(String Name, int age, long number, String Address,int salary){
        this.Name = Name;
        this.age = age;
        this.number = number;
        this.address = Address;
        this.salary = salary;
    }
}
class Manager extends EmployeeDemo{
    String Department;
    Manager(String Name, int age, long number, String Address, int salary){
        this.Name = Name;
        this.age = age;
        this.number = number;
        this.address = Address;
        this.salary = salary;
    }
}
public class Employee {
    public static void main(String[] args) {
        Officer o = new Officer("Darsana", 21,908475950,"London",200000 );
        Manager m = new Manager("Devika", 15, 987037467, "NewYork", 2000000);
        System.out.println("Name: "+o.Name+"\n"+"Age: "+o.age+"\n"+"Number: "+o.number+"\n"+"Address: "+o.address+"\n");
        o.print_salary();
        System.out.println("Name: "+m.Name+"\n"+"Age: "+m.age+"\n"+"Number: "+m.number+"\n"+"Address: "+m.address+"\n");
        m.print_salary();

    }
    
}
