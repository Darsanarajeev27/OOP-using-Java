import java.util.*;
class ThreadR extends Thread{
    public void run(){
        Random rand = new Random();
        for(int i=0;i<10;i++){
            int random = rand.nextInt(100);
            if(random%2==0){
                ThreadE te = new ThreadE(random);
                te.start();
            }
            else{
                ThreadO to = new ThreadO(random);
                to.start();
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){

            }
        }
    }
}
class ThreadE extends Thread{
    public int random;
    public ThreadE(int random){
        this.random = random;
    }
    public void run(){
        System.out.println("Square of "+random +" = "+(random*random));
    }
}
class ThreadO extends Thread{
    public int random;
    public ThreadO(int random){
        this.random = random;
    }
    public void run(){
        System.out.println("Cube of "+random+" = "+(random*random*random));
    }
}
public class MultiThreadRandom {
    public static void main(String[] args) {
        ThreadR r = new ThreadR();
        r.start();
    }
    
}
