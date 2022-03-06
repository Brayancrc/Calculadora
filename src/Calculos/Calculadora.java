package Calculos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;
	private JTextComponent txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 315, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 281, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		//---------------------------------Row 1----------------------------------
		JButton btnSet = new JButton("<-");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String set=null;
				
				if(txtDisplay.getText().length() > 0){
				StringBuilder strB = new StringBuilder(txtDisplay.getText());
				strB.deleteCharAt(txtDisplay.getText().length() - 1);
				set = strB.toString();
				txtDisplay.setText(set);
				
				}
			}
		});
		btnSet.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSet.setBounds(10, 54, 69, 50);
		frame.getContentPane().add(btnSet);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(80, 54, 69, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnPor = new JButton("%");
		btnPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPor.setBounds(151, 54, 69, 50);
		frame.getContentPane().add(btnPor);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(222, 54, 69, 50);
		frame.getContentPane().add(btnPlus);
		
		//---------------------------------Row 2----------------------------------
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						String EnterNumber = txtDisplay.getText() + btn7.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn7.setBounds(10, 110, 69, 50);
				frame.getContentPane().add(btn7);
				
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn8.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn8.setBounds(80, 110, 69, 50);
				frame.getContentPane().add(btn8);
				
				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn9.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn9.setBounds(151, 110, 69, 50);
				frame.getContentPane().add(btn9);
				
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(222, 110, 69, 50);
				frame.getContentPane().add(btnSub);
				
				//---------------------------------Row 3----------------------------------
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn4.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 166, 69, 50);
				frame.getContentPane().add(btn4);
				
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn5.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(80, 166, 69, 50);
				frame.getContentPane().add(btn5);
				
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn6.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(151, 166, 69, 50);
				frame.getContentPane().add(btn6);
				
				JButton btnMult = new JButton("*");
				btnMult.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "*";
					}
				});
				btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMult.setBounds(222, 166, 69, 50);
				frame.getContentPane().add(btnMult);
				
				//---------------------------------Row 4----------------------------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 222, 69, 50);
				frame.getContentPane().add(btn1);
				
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn2.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(80, 222, 69, 50);
				frame.getContentPane().add(btn2);
				
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(151, 222, 69, 50);
				frame.getContentPane().add(btn3);
				
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(222, 222, 69, 50);
				frame.getContentPane().add(btnDiv);
		
				//---------------------------------Row 5----------------------------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 278, 69, 50);
				frame.getContentPane().add(btn0);
				
				JButton btnDot = new JButton(".");
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(80, 278, 69, 50);
				frame.getContentPane().add(btnDot);
				
				JButton btnPM = new JButton("+-");
				btnPM.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
					ops = ops * (-1);
					txtDisplay.setText(String.valueOf(ops));
					
					}
				});
				btnPM.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPM.setBounds(151, 278, 69, 50);
				frame.getContentPane().add(btnPM);
				
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String answer;
					secondnum = Double.parseDouble(txtDisplay.getText());
					if (operations == "+")
					{
						result = firstnum + secondnum;
						answer = String.format("%.2f",result);
						txtDisplay.setText(answer);
					}
					else if (operations == "-")
					{
						result = firstnum - secondnum;
						answer = String.format("%.2f",result);
						txtDisplay.setText(answer);
					}
					else if (operations == "*")
					{
						result = firstnum * secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					else if (operations == "/")
					{
						result = firstnum / secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					else if (operations == "%")
					{
						result = firstnum % secondnum;
						answer = String.format("%.2f", result);
						txtDisplay.setText(answer);
					}
					
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(222, 278, 69, 50);
				frame.getContentPane().add(btnEqual);
	}
}
