import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
//import javax.swing.ImageIcon;
public class SwingApplicationLabel {
    public static void main(String[] args) {

       // ImageIcon image = new ImageIcon("C:\Users\acer\Pictures\Acer\Acer_Wallpaper_05_3840x2400.jpg");
       Border border = BorderFactory.createLineBorder(Color.green,3);
       
       JLabel label = new JLabel();//create a label
        label.setText("Hey guys!!");//set text of label
       // label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.LEFT);//set text LEFT,RIGHT,CENTER of the imageicon 
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP<BOTTOM,CENTER of the imageicon
        label.setForeground(Color.green);//set colour of text, can also be done using new Color(0,0,0) inside the parenthesis
        label.setFont(new Font("MV Boli",Font.PLAIN, 20));//set the font of text
        label.setIconTextGap(100);//set gap of text to image
        label.setBackground(Color.black);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
        label.setBounds(0,0,250,250);//set x,y position within frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Label Example");
        frame.setVisible(true);
        frame.add(label);
        frame.setLayout(null);//step along with line 27
        //frame.pack();//fills the text or image+text within label in a small space, also comment out lines 35,31,27 for its working
    }
    
}
