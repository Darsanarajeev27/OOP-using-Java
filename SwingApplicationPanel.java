import java.awt.Color;
//import javax.swing.*; OR
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class SwingApplicationPanel {
    public static void main(String[] args) {
        
        //JPanel = a GUI component that function as a container to hold other components
        
        //ImageIcon icon = new ImageIcon("C:\Users\acer\Desktop\Hult Prize\images.jpeg");

        JLabel label = new JLabel();
        label.setText("Hi");
        //label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250); 
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    

    }
}
