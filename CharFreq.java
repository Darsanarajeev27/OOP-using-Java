import java.util.*;
class Freq{
    String s1;
    char ch;
}
public class CharFreq {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        Freq f = new Freq();
        System.out.println("Enter a string: ");
        f.s1 = sc.nextLine();
        System.out.println("Enter the character whose frequency is to be founfd: ");
        f.ch = sc.next().charAt(0);
        int length = f.s1.length();
        for(int i=0;i<length;i++){
            char a = f.s1.charAt(i);
            if(f.ch == a){
                count++;
            }
        }
        System.out.println("Frequency of "+f.ch+" is "+count);
        sc.close();
    }
    
}
