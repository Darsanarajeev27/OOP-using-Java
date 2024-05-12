import java.util.*;
public class DoublyLL {
    public static void main(String[] args) {
        int ch, element, position;
        LinkedList<Integer> dblList = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Insert element at beginning");
        System.out.println("2.Insert element at end");
        System.out.println("3.Insert element between 2 nodes");
        System.out.println("4.Delete a given element");
        System.out.println("5.Display elements in the list");
        System.out.println("6.Exit");
        do{
            System.out.println("Choose your choice(1-6):");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter element to be inserted: ");
                    element = sc.nextInt();
                    dblList.addFirst(element);
                    System.out.println("Element inserted successfully");
                    break;

                case 2:
                    System.out.println("Enter element to be inserted: ");
                    element = sc.nextInt();
                    dblList.addLast(element);
                    System.out.println("Element inserted successfully");
                    break;

                case 3:
                    System.out.println("Enter position to insert element : ");
                    position = sc.nextInt();
                    if(position<=dblList.size()){
                        System.out.println("Enter element: ");
                        element = sc.nextInt();
                        dblList.add(position,element);
                        System.out.println("Element inserted successfully");
                    }
                    else{
                        System.out.println("Enter valid position between 0 and "+dblList.size());
                    }
                    break;

                case 4:
                    System.out.println("Enter element to be deleted: ");
                    int e = sc.nextInt();
                    if(dblList.contains(e)){
                        dblList.remove(e);
                        System.out.println("succesfully deleted");
                    }
                    else{
                        System.out.println("Enter element present in the list!");
                    } 
                    break;   

                case 5:
                    System.out.println("Elements in the list are:");
                    Iterator itr = dblList.iterator();  
                    while(itr.hasNext()){
                        System.out.print(itr.next()+"<->");
                    }  
                    System.out.println("NULL");
                    break;

                case 6:
                    System.out.println("Program terminated");
                    break;    

                default:
                    System.out.println("Invalid choice");    
                
            }
        }while(ch!=6);
        sc.close();
    }

    
}
