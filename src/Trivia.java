import java.awt.EventQueue;

import java.io.*;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.Timer;

public class Trivia {
	int x = 0;
	JLabel lblCorrect = new JLabel("Score: 0");
	JLabel lblWrong = new JLabel("");

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trivia window = new Trivia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Trivia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 747);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblC = new JLabel("\u222B");
		lblC.setHorizontalAlignment(SwingConstants.TRAILING);
		JLabel lblC2 = new JLabel("t");
		
		JLabel lblX = new JLabel("X");
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(0, 190, 534, 52);
		lblX.setFont(new Font("Myriad Arabic", Font.PLAIN, 45));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblX);
		
		JLabel lbln = new JLabel("XX");
		lbln.setForeground(Color.WHITE);
		lbln.setBounds(200, 177, 73, 79);
		lbln.setHorizontalAlignment(SwingConstants.CENTER);
		lbln.setFont(new Font("Myriad Arabic", Font.PLAIN, 45));
		frame.getContentPane().add(lbln);
		
		JLabel lblm = new JLabel("XX");
		lblm.setForeground(Color.WHITE);
		lblm.setBounds(259, 152, 73, 79);
		lblm.setHorizontalAlignment(SwingConstants.CENTER);
		lblm.setFont(new Font("Myriad Arabic", Font.PLAIN, 45));
		frame.getContentPane().add(lblm);
		
		JLabel lbln2 = new JLabel("XX/XX");
		lbln2.setForeground(Color.WHITE);
		lbln2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbln2.setBounds(-76, 346, 201, 104);
		lbln2.setFont(new Font("Myriad Arabic", Font.PLAIN, 35));
		frame.getContentPane().add(lbln2);
		
		JLabel lblm2 = new JLabel("XX");
		lblm2.setForeground(Color.WHITE);
		lblm2.setBounds(124, 338, 73, 79);
		lblm2.setHorizontalAlignment(SwingConstants.CENTER);
		lblm2.setFont(new Font("Myriad Arabic", Font.PLAIN, 35));
		frame.getContentPane().add(lblm2);
		
		
		JLabel label_1 = new JLabel("XX/XX");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Myriad Arabic", Font.PLAIN, 35));
		label_1.setBounds(242, 337, 201, 122);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("XX");
		label_2.setForeground(Color.WHITE);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Myriad Arabic", Font.PLAIN, 35));
		label_2.setBounds(443, 338, 73, 79);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("X");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Myriad Arabic", Font.PLAIN, 35));
		label_3.setBounds(166, 372, 571, 52);
		frame.getContentPane().add(label_3);
		
		////////
		
		lblCorrect.setForeground(Color.LIGHT_GRAY);
		lblCorrect.setFont(new Font("Impact", Font.PLAIN, 96));
		lblCorrect.setHorizontalAlignment(SwingConstants.CENTER);
		lblCorrect.setBounds(0, 505, 534, 130);
		frame.getContentPane().add(lblCorrect);
		
		JLabel lblWrong = new JLabel("");
		lblWrong.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrong.setForeground(Color.RED);
		lblWrong.setFont(new Font("Impact", Font.PLAIN, 96));
		lblWrong.setBounds(0, 505, 534, 130);
		frame.getContentPane().add(lblWrong);
		
		JButton btnStart = new JButton("Start");
		btnStart.setFont(new Font("Adobe Kaiti Std R", Font.PLAIN, 50));
		btnStart.setBounds(125, 76, 265, 61);
		
		//MAIN BUTTON
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// makes integrate or derive
				int xxx[] = {1,1,1,1,1,2,2,2,2,2};
				int fift = (int)(Math.random()*10);
				
				if(xxx[fift] == 1) {
					lblC.setText("\u222B");
				}
				else {
					lblC.setText("dy/dx");
				}
				//makes integrate or derive
				
				
				// makes random equation
				
				int n = nNumberSmall();
				lbln.setText(Integer.toString(n));
				
				int m = nNumberSmall();
				lblm.setText(Integer.toString(m));
				
				// makes random equation
				

				if(lblC.getText().contentEquals("\u222B")) {
				//makes integral
				double m2 = m+1;
				Fraction c = new Fraction(n, m+1);
				c.reduce();
				//makes integral
				

				//sets the answer and fake answer
				int xx[] = {1,1,1,1,1,2,2,2,2,2};
				int fif = (int)(Math.random()*10);
				
				if(xx[fif] == 1) {
				lbln2.setText(c.toString());
				int o = nNumberSmall();
				int p = nNumberSmall();
				Fraction x = new Fraction(o,p);
				label_1.setText(x.toString());
				}
				else {
					label_1.setText(c.toString());
					int q = nNumberSmall();
					int r = nNumberSmall();
					Fraction x = new Fraction(q,r);
					lbln2.setText(x.toString());
				}

				lblm2.setText(Double.toString(m2).substring(0,Double.toString(m2).length()-2)); 
				label_2.setText(Double.toString(m2).substring(0,Double.toString(m2).length()-2)); 
				}
				
				else {
					int asas = n*m;
					int m3 = m-1;
					int as = nNumberSmall();
					int sa = nNumberSmall();
					int saas = as*sa;
					
					int yy[] = {1,1,1,1,1,2,2,2,2,2};
					int fi = (int)(Math.random()*10);
					
					if(yy[fi]==1) {
						lbln2.setText(Integer.toString(asas));
						label_1.setText(Integer.toString(saas));
					}
					else {
						label_1.setText(Integer.toString(asas));
						lbln2.setText(Integer.toString(saas));
					}
					lblm2.setText(Integer.toString(m3));
					label_2.setText(Integer.toString(m3));
				}
			}
		});
		frame.getContentPane().add(btnStart);
		
		JLabel label = new JLabel("X");
		label.setForeground(Color.WHITE);
		label.setBounds(-153, 372, 571, 52);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Myriad Arabic", Font.PLAIN, 35));
		frame.getContentPane().add(label);
		
		
		//LEFT
		
		JButton btnNewButton = new JButton("A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(lblC.getText().contentEquals("\u222B")) {
				//check if answer is the integral
				int ww = Integer.parseInt(lbln.getText());
				int www = Integer.parseInt(lblm.getText());
				Fraction c = new Fraction(ww, www+1);
				c.reduce();
				if(lbln2.getText().equals( c.toString())) {
					x++;
					lblCorrect.setText("Score: " + x);
					btnStart.doClick();
				}
				else {
					lblCorrect.setText(" ");
					lblWrong.setText("GAME OVER");
					JOptionPane.showMessageDialog(null, "Your Score: " + x);
					x = 0;
					lbln2.setText(" ");
					label_1.setText(" ");
					lblm.setText(" ");
					lblm2.setText(" ");
					lbln.setText(" ");
					label_2.setText(" ");
					lblWrong.setText(" ");
				}
				}
				else {
					int ww2 = Integer.parseInt(lbln.getText());
					int www2 = Integer.parseInt(lblm.getText());
					int h = ww2*www2;
					
					if(lbln2.getText().equals(Integer.toString(h))) {
						x++;
						lblCorrect.setText("Score: " + x);
						btnStart.doClick();
					}
					else {
						lblCorrect.setText(" ");
						lblWrong.setText("GAME OVER");
						JOptionPane.showMessageDialog(null, "Your Score: " + x);
						x = 0;
						lbln2.setText(" ");
						label_1.setText(" ");
						lblm.setText(" ");
						lblm2.setText(" ");
						lbln.setText(" ");
						label_2.setText(" ");
						lblWrong.setText(" ");
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Adobe Kaiti Std R", Font.PLAIN, 45));
		btnNewButton.setBounds(21, 417, 156, 61);
		frame.getContentPane().add(btnNewButton);
		
		
		//RIGHT
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblC.getText().contentEquals("\u222B")) {
				int ww = Integer.parseInt(lbln.getText());
				int www = Integer.parseInt(lblm.getText());
				Fraction c = new Fraction(ww, www+1);
				c.reduce();
				if(label_1.getText().equals( c.toString())) {
					x++;
					lblCorrect.setText("Score: " + x);
					btnStart.doClick();
					
				}
				else {
					lblCorrect.setText(" ");
					lblWrong.setText("GAME OVER");
					JOptionPane.showMessageDialog(null, "Your Score: " + x);
					x = 0;
					lbln2.setText(" ");
					label_1.setText(" ");
					lblm.setText(" ");
					lblm2.setText(" ");
					lbln.setText(" ");
					label_2.setText(" ");
					lblWrong.setText(" ");
				}
				}
				else {
					int ww2 = Integer.parseInt(lbln.getText());
					int www2 = Integer.parseInt(lblm.getText());
					int h = ww2*www2;
					
					if(label_1.getText().equals(Integer.toString(h))) {
						x++;
						lblCorrect.setText("Score: " + x);
						btnStart.doClick();
					}
					else {
						lblCorrect.setText(" ");
						lblWrong.setText("GAME OVER");
						JOptionPane.showMessageDialog(null, "Your Score: " + x);
						x = 0;
						lbln2.setText(" ");
						label_1.setText(" ");
						lblm.setText(" ");
						lblm2.setText(" ");
						lbln.setText(" ");
						label_2.setText(" ");
						lblWrong.setText(" ");
					}
				}
			}
		});
		btnB.setFont(new Font("Adobe Kaiti Std R", Font.PLAIN, 45));
		btnB.setBounds(347, 417, 156, 61);
		frame.getContentPane().add(btnB);
		
		
		lblC.setForeground(Color.WHITE);
		lblC.setFont(new Font("Adobe Caslon Pro", Font.PLAIN, 70));
		lblC.setBounds(-28, 142, 221, 141);
		frame.getContentPane().add(lblC);
		
		JLabel label_5 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/bgggg.png")).getImage();
		label_5.setIcon(new ImageIcon (img));
		label_5.setBounds(-11, 0, 584, 721);
		frame.getContentPane().add(label_5);
		
		
		lblC2.setBounds(443, 76, 46, 14);
		frame.getContentPane().add(lblC2);

	}
	
	
	public int nNumberSmall() {
		int n = (int) (Math.random()*30);
		if (n==0 || n==1)
			n= 8;
		return n;
	}
	
	
	
	public int nNumber() {
		int n = (int) (Math.random()*100);
		if (n==0)
			n= 24;
		return n;
	}
}
