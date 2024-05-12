public class StringbufferOperations {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");

        //Concatenating strings
        s1.append(" Java");
        System.out.println(s1);

        //Inserting string in between existing string using str.insert(int beginindex, string str1)
        s1.insert(5," My");//inserts required string at the required index mentioned
        System.out.println(s1);

        //Replacing a portion of string with other using the method str.insert(int beginindex, int endindex, string str1)
        //s1.replace(3,9,"Program");
        //System.out.println(s1);
        s1.replace(3,8,"Program");//To notice the change change the commented statements and check
        System.out.println(s1);

        //To delete a portion of string using str.delete(int beginindex, int endindex)
        s1.delete(2,5);
        System.out.println(s1);

        //To reverse a string using str.reverse()
        StringBuffer s2 = new StringBuffer("Hey");
        s2.reverse();
        System.out.println(s2);
    }
}
