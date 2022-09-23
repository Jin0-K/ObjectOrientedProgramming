import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ChangeBGColor extends JFrame{
	public ChangeBGColor() {
		setTitle("¹è°æ»ö ¹Ù²Ù±â");
		setSize(400, 200);
		
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		JButton red = new JButton("»¡°­");
		JButton yellow = new JButton("³ë¶û");
		red.addActionListener(new RedBG());
		yellow.addActionListener(new YellowBG());
		cp.add(red);
		cp.add(yellow);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class RedBG implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Container contentpane = getContentPane();
			contentpane.setBackground(Color.RED);
		}
	}
	class YellowBG implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			Container contentpane = getContentPane();
			contentpane.setBackground(Color.YELLOW);
		}
	}

	public static void main(String[] args) {
		new ChangeBGColor();
	}

}
