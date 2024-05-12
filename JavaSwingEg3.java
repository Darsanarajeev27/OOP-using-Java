import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class JavaSwingEg3 implements ActionListener {
    JFrame f1;
    JTextField t;
    JButton b;
    File f;
    JavaSwingEg3(){
        try{
            f = new File("NewestFile.txt");
            f.createNewFile();
        }
        catch(Exception e){
            e.printStackTrace();
        }
       f1 = new JFrame("JavaSwing");
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setSize(500,500);
       f1.setLayout(new FlowLayout());
       f1.setVisible(true);
       
       t = new JTextField(10);

       b = new JButton("Save");
       b.addActionListener(this);

       f1.add(b);
       f1.add(t);
    }
    public void actionPerformed(ActionEvent e){
        if(b == e.getSource()){
            String s = t.getText();
            try{
                FileWriter fw = new FileWriter(f);
                fw.write(s+"\n");
                fw.close();
            }
            catch(IOException e1){
                e1.printStackTrace();
            }
        }
        displayfielddetails();
    }

    public void displayfielddetails(){
        try{
            FileReader fr = new FileReader(f);
            int s;
            int wordscount = 0;
            String x ="";
            while((s=fr.read())!=-1){
                x += (char)s;
            }

            StringTokenizer st = new StringTokenizer(x," ");
            while(st.hasMoreTokens()){
                wordscount ++;
                System.out.println(st.nextToken());
            }
            System.out.println("No of words: "+wordscount);
            fr.close();
        }
        catch(Exception e){
            System.out.println("Error");
        }
    } 
    public static void main(String[] args) {
        new JavaSwingEg3();
       
    }

}

