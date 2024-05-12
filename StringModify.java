public class StringModify {
    public static void main(String[] args) {
        //Use of replace() method
        String str = "Java is a very good language";
        String strReplace = str.replace('a','e');//replaces all a with e
        System.out.println("Original string is:"+str);
        System.out.println("New String is:"+strReplace);
        String rstr = str.replace("is","was");//replaces is with was
        System.out.println("Next new string is:"+rstr);
        System.out.println("");

        //Use of replaceAll() method
        String str1 = "My name is Bob\n Bob is very happy\n Bob lives in Kerala";
        String rstr1 = str1.replaceAll("Bob","Vishnu");
        System.out.println("Old String: "+str1);
        System.out.println("New String: "+rstr1);
        
        String r1str1 = str1.replaceAll("\n",".");
        System.out.println("New String is: "+r1str1);
        String r2str1 = str1.replaceAll("\\s","");//to eliminate whitespaces
        System.out.println("New String is: "+r2str1);
    }
}
