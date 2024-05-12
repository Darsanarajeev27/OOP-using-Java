import java.util.*;
class Palindrome{
    String s1;
    String s2 = "";
    char ch;
}
public class StringPalindrome {
    public static void main(String[] args) {
        // String str1 = "Hello There!";
        // String str2 = str1.replaceAll("\\s","");
        // System.out.println(str2);

        // int m = 20;
        // String s = String.valueOf(m);
        // System.out.println("Hello"+10);

        Scanner sc = new Scanner(System.in);
        Palindrome n = new Palindrome();
        System.out.println("Enter a string: ");
        n.s1 = sc.nextLine();
        int length = n.s1.length();
        for(int i=0;i<length;i++){
            n.ch = n.s1.charAt(i);
            n.s2 = n.ch + n.s2;
        }
        if(n.s1.equals(n.s2)){
            System.out.println("Palindrome\n");
        }else {
            System.out.println("Not palindrome");
        }

    }
    
}
