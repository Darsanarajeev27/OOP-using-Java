import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.beans.JavaBean;
public class JavaSwingEg implements ActionListener{
    JFrame f; 
    JButton b1,b2;
    JLabel l;
    JavaSwingEg(){
        f = new JFrame("Question");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,450);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        b1 = new JButton("Yes");
        b1.addActionListener(this);
        b2 = new JButton("NO");
        b2.addActionListener(this);
        l = new JLabel();
        f.add(l);
        f.add(b1);
        f.add(b2);
    }
    public void actionPerformed(ActionEvent e){
        if(b1 == e.getSource()){
            l.setText("It's YES!");
        }
        else{
            l.setText("It's NO");
        }
    }
    public static void main(String[] args) {
        new JavaSwingEg();
    }
    
}
