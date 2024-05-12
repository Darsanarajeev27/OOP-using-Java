public class StringValueOf {
    public static void main(String[] args) {
        int x = 10;
        String s = String.valueOf(x);
        System.out.println(10+s);

        //Java String is immutable
        String s1 = "Darsana";
        s1.concat("Rajeev");
        System.out.println("String is: "+s1);
        //concatenating extrenally
        s1 = s1.concat(" Rajeev");
        System.out.println("String is: "+s1);
    }
}
