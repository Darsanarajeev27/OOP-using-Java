import java.util.*;
class x{
    int y;
    x(){

    }
}
public class GarbageCollectionEg {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Total memory : "+r.totalMemory());
        long mem1, mem2, mem3;
        mem1 = r.freeMemory();
        System.out.println("Free memory: "+mem1);
        System.out.println("Enter size of an array: ");
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int A[] = new int[z];
        mem2 = r.freeMemory();
        System.out.println("Free memeory is: "+mem2);
        for(int i=0;i<z;i++){
            x y = new x();
        }
        r.gc();
        mem3 = r.freeMemory();
        System.out.println("Free memeory after garbage collection: "+mem3);

    }
}
