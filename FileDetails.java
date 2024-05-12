import java.io.*;
public class FileDetails {
    public static void main(String[] args) {
        File f = new File("myFile.txt");
        if(f.exists()){
            System.out.println("File name is:"+f.getName());
            System.out.println("File path:"+f.getAbsolutePath());
            System.out.println("Writeable:"+f.canWrite());
            System.out.println("Readable:"+f.canRead());
            System.out.println("File size in bytes:"+f.length());
        }else{
            System.out.println("File does not exist!");
        }
    }
}
