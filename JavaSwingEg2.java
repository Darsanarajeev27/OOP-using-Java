import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JavaSwingEg2 implements ActionListener {
    JFrame f;
    JTextField t1, t2, t3;
    JButton b1,b2,b3,b4;
    JavaSwingEg2(){
        f = new JFrame("Calculator");
        f.setSize(500,500);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setVisible(true);

        b1 = new JButton("+");
        b1.addActionListener(this);
        b2 = new JButton("-");
        b2.addActionListener(this);
        b3 = new JButton("*");
        b3.addActionListener(this);
        b4 = new JButton("/");
        b4.addActionListener(this);
        
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(t1);
        f.add(t2);
        f.add(t3);
    }

    public void actionPerformed(ActionEvent e){
        String a = t1.getText();
        int a1 = Integer.parseInt(a);
        String c = t2.getText();
        int c1 = Integer.parseInt(c);

        if(b1==e.getSource()){
            t3.setText(""+(a1+c1));
        }
        else if(b2 == e.getSource()){
            t3.setText(""+(a1-c1));
        }
        else if(b3 == e.getSource()){
            t3.setText(""+(a1*c1));
        }
        else{
            t3.setText(""+(a1/c1));
        }
            
    }
    public static void main(String[] args) {
        new JavaSwingEg2();
    }

    
}
