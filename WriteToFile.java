import java.io.*;
public class WriteToFile {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("myFile.txt");
            fw.write("This is a sample file");
            fw.close();
            System.out.println("Successfully wrote to the file");
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
    
}
