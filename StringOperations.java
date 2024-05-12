public class StringOperations{
    public static void main(String[] args) {
        //String constructor of the form: String(char ch, int startindex, int count);
        char ch[] = {'s','c','i','e','n','c','e'};
        String s1 = new String(ch, 1,3);
        System.out.println(s1);

        String name = "What is your name?";

        //String method to find length: length()
        System.out.println("Length of the string is:"+ name.length());

        //String comparison methods: equals(), equalsIgnoreCase(), ==, compareTo
        String s2 = "Darsana";
        String s3 = new String("Darsana");
        String s4 = "Devika";
        String s5 = "darsana";
        System.out.println(s2.equals(s3));//TRUE
        System.out.println(s2.equals(s4));//FALSE
        System.out.println(s2.equalsIgnoreCase(s5));//TRUE
        System.out.println(s2==s3);//FALSE,compares references not value
        System.out.println(s2==s4);//FALSE
        System.out.println(s2.compareTo(s3));//0,returns 0 if equal, +ve if 1st one is greater, -ve if 1st one is lesser
        System.out.println(s2.compareTo(s4));//-4(-VE VALUE)

        //String method for searching: contains()
        System.out.println(name.contains("is your"));
        System.out.println(name.contains("the"));

        //String method to extract a character from the string: str.charAt(int index);
        System.out.println("The first character in the string s2 is:"+s2.charAt(0));
        System.out.println("The last character in the string s2 is:"+s2.charAt((s2.length())-1));
        //printing chararcters at odd index
        System.out.println("Elements at odd index are:");
        for(int i=0; i<name.length()-1;i++){
            if(i%2!=0){
                System.out.println("Element at index "+i+" is:"+name.charAt(i));
            }
        }
        //to print count of a character
        int count=0;
        int i;
        for(i=0;i<s2.length();i++){
            if(s2.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Frequency of character 'a' is: "+count );
    }
    
}
