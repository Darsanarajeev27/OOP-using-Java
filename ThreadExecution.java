class MyThread extends Thread{
    public void run(){
        System.out.println("Current thread is: "+Thread.currentThread().getName());
        System.out.println("run() method called");
    }
}
public class ThreadExecution {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();
        t.start();
    }
    
}
