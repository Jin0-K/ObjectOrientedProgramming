import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/* Change content pane
class MyPanel extends JPanel {
	
}
*/

public class MyFrame extends JFrame {
	/*
	public MyFrame() {
		super("Title String"); //Title using JFrame("Title String") constructor
		//setTitle("Title String"); // Title by method call
		setSize(300, 300);
		setVisible(true); // Default = false, therefore, should be set
		
		Container contentPane = getContentPane(); // Figure out the contentPane attached with frame
		
		JButton button = new JButton("Click"); // Create button component
		contentPane.add(button); // Attach button on contentPane
	}
	*/
	/*
	public MyFrame() {
		setTitle("ContentPane and JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set to exit when the frame window is closed
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	*/
	
	public MyFrame() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // FlowLayout(Sort direction, horizontal gap, vertical gap)
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//MyFrame frame = new MyFrame();
		//new MyFrame();
		new MyFrame();
	}

}
