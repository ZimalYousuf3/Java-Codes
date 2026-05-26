
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;

public class SimpleCalc extends JFrame implements ActionListener {
	
	JTextField n1, n2 ;
	JLabel lbl1, lbl2, lbl3, lbl4, result;
	JButton sum;

	public SimpleCalc() {
		
		setSize (250,400);
		setLayout (new GridLayout(4,2,30,50)) ;
		
		setTitle ("Calculator");
		
		// Setting Text Fields
		n1 = new JTextField ();
		n2 = new JTextField ();
		
		// Setting Labels
		lbl1 = new JLabel(" Enter 1st number: ");
		lbl2 = new JLabel(" Enter 2nd number: ");
		lbl3 = new JLabel(" Click to calculate: ");
		lbl4 = new JLabel(" Result: ");
		result = new JLabel ();
		
		// Setting Button
	    sum = new JButton ("Calculate");
		
		// Adding Fields, Labels & Button
		add(lbl1); add(n1);
		add(lbl2); add(n2);
		add(lbl3); add(sum);
		add(lbl4); add(result);
		
		sum.addActionListener(this);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new SimpleCalc();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(n1.getText());
		int b = Integer.parseInt(n2.getText());
		
		int sum = a + b;
		
		result.setText(String.valueOf(sum));
		
	}

}
