import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator extends JFrame {
	public Calculator() {
		setTitle("°è»ê±â");
		setSize(400, 300);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JLabel result = new JLabel("0", SwingConstants.RIGHT);
		cp.add(result, BorderLayout.NORTH);
		
		JPanel pan = new JPanel();
		pan.setLayout(new GridLayout(4, 4));
		
		pan.add(new JButton("1"));
		pan.add(new JButton("2"));
		pan.add(new JButton("3"));
		pan.add(new JButton("+"));
		
		pan.add(new JButton("4"));
		pan.add(new JButton("5"));
		pan.add(new JButton("6"));
		pan.add(new JButton("-"));
		
		pan.add(new JButton("7"));
		pan.add(new JButton("8"));
		pan.add(new JButton("9"));
		pan.add(new JButton("*"));
		
		pan.add(new JButton("0"));
		pan.add(new JButton("C"));
		pan.add(new JButton("="));
		pan.add(new JButton("/"));
		
		cp.add(pan, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

}
