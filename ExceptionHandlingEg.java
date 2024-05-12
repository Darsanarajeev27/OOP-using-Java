import java.io.*;
class MyClass{
    public void myMethod(int num) throws IOException, ClassNotFoundException{
        if(num==1){
            throw new IOException("IOexception occurred");
        }
        else    
            throw new ClassNotFoundException("ClassNotFoundException Occurred");
    }
}
public class ExceptionHandlingEg {
    public static void main(String[] args) {
        try{
            MyClass m = new MyClass();
            m.myMethod(1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
