import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;


public class CurrencyConverter extends JFrame implements ActionListener {
	JTextField PakCurrency, USD, GBP;
	JLabel PKR, usd,gbp;
	JButton convert, clear ;

	public CurrencyConverter() {
		setSize (300,300);
		setLayout(new GridLayout(4,6,15,15));
		
		setTitle(" Currency Converter ");
		
		PKR = new JLabel("Pakistani Rupee:");
		add(PKR);
		
		PakCurrency = new JTextField("");
		add(PakCurrency);
		
		usd = new JLabel("Pakistani Rupee to USD:");
		add(usd);
		
		USD = new JTextField ("");
		add (USD);
		
		gbp = new JLabel("Pakistani Rupee to GBP:");
		add(gbp);
		
		GBP = new JTextField ("");
		add (GBP);
		
		convert = new JButton("CONVERT");
		add(convert);
		convert.addActionListener(this);
		
		clear = new JButton("CLEAR");
		add(clear);
		clear.addActionListener(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == convert) {
			double pkr = Double.parseDouble(PakCurrency.getText());
			double usdValue = pkr / 280;
	        double gbpValue = pkr / 350;
	        
	        USD.setText(String.format("%.2f",usdValue));
	        GBP.setText(String.format("%.2f", gbpValue));
		}
		
		if (e.getSource() == clear) {
			PakCurrency.setText(String.valueOf(""));
			USD.setText(String.valueOf(""));
	        GBP.setText(String.valueOf(""));
		}
	}

	public static void main(String[] args) {
		new CurrencyConverter();

	}

}
