class First{
    /*synchronized*/void display(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
class Second implements Runnable{
    First fobj;
    String msg;
    Second(First f , String str){
        fobj = f;
        msg= str;
        new Thread(this).start();
    }
    public void run(){
        synchronized(fobj){
            fobj.display(msg);
        }
    }
}
public class ThreadSynchronizationEg {
    public static void main(String[] args) {
        First fnew = new First();
        Second ss1 = new Second(fnew,"Hello");
        Second ss2 = new Second(fnew,"Hii");
        Second ss3 = new Second(fnew,"GoodMorning");
       
    }
}
