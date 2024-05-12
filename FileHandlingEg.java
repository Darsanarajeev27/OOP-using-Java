import java.util.*;
import java.io.*;

public class FileHandlingEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int choice =0;
            File f = new File("hloFile.txt");
            if(f.createNewFile()){
                System.out.println("File "+f.getName()+" successfully created");
            }
            else{
                System.out.println("File already exist");
            }
            while(choice!=3){
                System.out.println("\n Choose Operation: \n1.Read File\n2.Write File\n3.Exit");
                choice = sc.nextInt();
                switch(choice){
                    case 1:
                        Scanner Reader = new Scanner(f);
                        while(Reader.hasNextLine()){
                            String data = Reader.nextLine();
                            System.out.println(data);
                        }
                        Reader.close();
                        break;
                       
                    case 2:
                        FileWriter fw = new FileWriter(f);    
                        String s;
                        System.out.println("Enter string: ");
                        s = sc.nextLine();
                        fw.write(s);
                        fw.close();
                        sc.close();
                        System.out.println("Written successfully");
                        break;

                    case 3:
                        break;    
                    }

            }


        }
        catch(Exception e){
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}
