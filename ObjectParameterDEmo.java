public class ObjectParameterDEmo {
    int data = 50;
    void change(ObjectParameterDEmo op){
        op.data = op.data +50;
    }
    public static void main(String[] args) {
        ObjectParameterDEmo op = new ObjectParameterDEmo();
        System.out.println("Before change: "+op.data);
        op.change(op);
        System.out.println("After change: "+op.data);

       
    }
}
