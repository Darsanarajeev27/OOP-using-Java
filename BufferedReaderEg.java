import java.io.*;
public class BufferedReaderEg {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("String read is: "+name);
    }
    
}
