import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
public class SwingApplicationFlowLayout {
    public static void main(String[] args) {
        //Layout Manager : Defines the natural layout for components within a container
        //Flowlayout : places components in a row , sized at their preferred size .
        //             If the horizontal spce in the conatiner is too small , the FlowLayout
        //             uses the next available row
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));//1st paramater positions the buttons within the frame, 2nd one horztnl spacing & 3rd one vertical spacing
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("0"));


        //JButton button1 = new JButton();

        //panel.add(button1);
        frame.add(new JButton("1"));// can be used instead of code lines 16 & 18
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("0"));

        frame.add(panel);
        frame.setVisible(true);

    }
}
