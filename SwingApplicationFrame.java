import javax.swing.JFrame;
//import javax.swing.ImageIcon;
import java.awt.Color;
public class SwingApplicationFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();//creates a frame
        frame.setTitle("JFrame title goes here");//sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXIT OUT OF APPLICATION
        frame.setSize(420,420);//sets the x-dimension and y-dimension of frame
        frame.setResizable(false);//prevent frame from being resized
        frame.setVisible(true);//make frame visible

        /*ImageIcon image = new ImageIcon("\"C:\\Users\\acer\\Desktop\\Google_Icons.webp\"");//create an imageicon
        frame.setIconImage(image.getImage());//change icon of frame*/

        //frame.getContentPane().setBackground(Color.BLACK);//change color of background
        frame.getContentPane().setBackground(new Color(123,50,250));   
    }
    
}
