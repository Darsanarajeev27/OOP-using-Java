
    class Display{
        synchronized void display(int i){
    
            System.out.println(i);
            try{
                Thread.sleep(40);
            }
            catch(Exception e){
                e.printStackTrace();
            }
    
        }
    }

    
    class even extends Thread{
        Display d;
        even(Display d){
            this.d = d;
        }
        public void run(){
            for(int i = 0; i < 10; i ++){
                if( i %2 == 0){
                    d.display(i);
                }
            }
        }
    }
    
    class odd extends Thread{
        Display d;
        odd(Display d){
            this.d = d;
        }
        public void run(){
            for(int i = 0; i < 10; i ++){
                if(i %2 != 0){
                    d.display(i);
                }
            }
        }
    }
    
    public class ThreadSynchronizationEg2 {
        public static void main(String[] args) { 
            Display dis = new Display();
            even e = new even(dis);
            odd o = new odd(dis);
            Thread t = new Thread(o);
            e.start();
            t.start();
        }
    }

