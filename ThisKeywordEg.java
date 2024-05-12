class Student{
    int rollno;
    String Name;
    float fee;

    Student(int rn, String n, float f){
        this.rollno = rn;
        this.Name = n;
        this.fee = f;
    }
    void display(){
        System.out.println(rollno+" "+Name+" "+fee);
    }
}

public class ThisKeywordEg {
    public static void main(String[] args) {
        Student s1 = new Student(29,"Darsana",20000);
        Student s2 = new Student(20,"Devika",20000);
        s1.display();
        s2.display();
    }
}
