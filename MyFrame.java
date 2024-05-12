import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame(){

        //ImageIcon icon = new ImageIcon("pont.png");// adds image into button, initializing step

        label = new JLabel();
        label.setText("Hey There!");
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("I'm a button");
        button.setFocusable(false);//avoids the default border around the text
        //button.setIcon(icon);//to add icon to button
        //button.setHorizontalTextPosition(JButton.CENTER);
        //button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.ITALIC, 25));
        //button.setIconTextGap(-15);//reduces the gap between icon and the text
        button.setForeground(Color.MAGENTA);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);//disables the button

        //button.addActionListener(e -> System.out.println("Hlo")); //does the same thing as lines 15, 26 to 31 and "implements ActionListener" in 7 do

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //System.out.println("Hlo");
            //button.setEnabled(false);//this causes the button to be clicked only once and after that it will be disabled
            label.setVisible(true);
        }
    }
    
}
