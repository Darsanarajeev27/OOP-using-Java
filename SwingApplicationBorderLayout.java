import javax.swing.JFrame;
import java.awt.BorderLayout;
import  java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class SwingApplicationBorderLayout {
    public static void main(String[] args) {
        
        //Layout manager: defines the natural layout for components within a container
        // 3 common managers
        // BorderLayout: A BorderLayout places components in five areas: NORTH, SOUTH, EAST, WEST, CENTER
        //               All extra space is placed in the center area
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,10));//CAUSES SPACE BETWEEN EAST AND WEST PANELS WITH THE CENTRAL ONE, TO MAKE SPACE BTW NORTH AND SOUTH CHANGE y COMPONENT FROM 0 TO SOME VALUE
        frame.setVisible(true);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.black);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);
    }
    
}
