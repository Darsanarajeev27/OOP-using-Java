import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Darsana");
        list.add("Devika");
        list.add("Binitha");
        list.add("Rajeev");
        //Traversing list through Iterator
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(list);
    }
}
