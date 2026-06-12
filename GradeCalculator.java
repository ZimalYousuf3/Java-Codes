import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GradeCalculator extends JFrame implements ActionListener {
	
	JTextField subject1, subject2, subject3, subject4, subject5, subject6;
	JLabel sub1, sub2, sub3, sub4, sub5, sub6, result, cgpa, Grade, calculate, r, gpa, g;
	JButton btn;

	public GradeCalculator() {
		
		setSize(250,400);
		setLayout(new GridLayout (10, 2, 5, 5));
		setTitle("Grade Calculator");
		
		// Setting Labels
		sub1 = new JLabel("  Subject-1: ");
		sub2 = new JLabel("  Subject-2: ");
		sub3 = new JLabel("  Subject-3: ");
		sub4 = new JLabel("  Subject-4: ");
		sub5 = new JLabel("  Subject-5: ");
		sub6 = new JLabel("  Subject-6: ");
		calculate = new JLabel("  Click to calculate:");
		result = new JLabel("  Result:");
		cgpa = new JLabel("  CGPA:");
		Grade = new JLabel("  Grade:");
		r = new JLabel();
		gpa = new JLabel();
		g = new JLabel();
		
		// Setting Text Fields
		subject1 = new JTextField();
		subject2 = new JTextField();
		subject3 = new JTextField();
		subject4 = new JTextField();
		subject5 = new JTextField();
		subject6 = new JTextField();
		
		// Setting Button
		btn = new JButton("Calculate");
		
		// Adding
		add(sub1) ; add(subject1) ;
		add(sub2) ; add(subject2) ;
		add(sub3) ; add(subject3) ;
		add(sub4) ; add(subject4) ;
		add(sub5) ; add(subject5) ;
		add(sub6) ; add(subject6) ;
		add(calculate) ; add(btn) ;
		add(result) ; add(r) ;
		add(cgpa) ; add(gpa) ;
		add(Grade) ; add(g) ;
		
		btn.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);


	}

	public static void main(String[] args) {
		new GradeCalculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int s1 = Integer.parseInt(subject1.getText());
		int s2 = Integer.parseInt(subject1.getText());
		int s3 = Integer.parseInt(subject1.getText());
		int s4 = Integer.parseInt(subject1.getText());
		int s5 = Integer.parseInt(subject1.getText());
		int s6 = Integer.parseInt(subject1.getText());

		int total = (s1+s2+s3+s4+s5+s6);
		double GPA = ((total/600.0))*4.0;
		String grade = " ";
		
		if (GPA >= 3.7) {
			grade = "A+";
		}
		
		else if (GPA >= 3.5) {
			grade = "A-";
		}
		
		else if (GPA >= 3.1) {
			grade = "B+";
		}
		
		else if (GPA >= 2.7) {
			grade = "B-";
		}
		
		else if (GPA >= 2.5) {
			grade = "C";
		}
		
		else if (GPA >= 2.1) {
			grade = "D";
		}
		
		else {
			grade = "F";
		}
		
		r.setText(String.valueOf(total));
		gpa.setText(String.valueOf(GPA));
		g.setText(String.valueOf(grade));
	}

}
