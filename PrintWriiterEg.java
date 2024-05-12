import java.io.*;
import java.util.*;
public class PrintWriiterEg {
    public static void main(String[] args) throws Exception{
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("It is a sample program");
        writer.flush();
        writer.close();
        PrintWriter writer1;
        writer1 = new PrintWriter(new File("C:\\Users\\acer\\Desktop\\Java\\JavaPrograms\\hloFile.txt"));
        writer1.write("Like java, learn java");
        writer1.flush();
        writer1.close();

        File f = new File("hloFile.txt");
        Scanner reader = new Scanner(f);
        while(reader.hasNextLine()){
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close(); 
    }
}
