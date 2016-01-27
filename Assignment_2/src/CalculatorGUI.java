import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI extends JFrame {
	
	private Calculator calculator = new Calculator();
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 290);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(6, 6, 271, 76);
		contentPane.add(textArea);
		
		JButton btn_NewButton = new JButton("1");
		btn_NewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(1);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		btn_NewButton.setBounds(2, 108, 60, 29);
		contentPane.add(btn_NewButton);
		
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(2);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button.setBounds(64, 108, 60, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(3);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_1.setBounds(128, 108, 60, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(4);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_2.setBounds(2, 138, 60, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(5);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_3.setBounds(64, 138, 60, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(6);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_4.setBounds(128, 138, 60, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(7);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_5.setBounds(2, 167, 60, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(8);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_6.setBounds(64, 167, 60, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(9);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_7.setBounds(128, 167, 60, 29);
		contentPane.add(button_7);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.numberButtonPressed(0);
				textArea.setText(String.valueOf(calculator.getOperand()));
			}
		});
		button_9.setBounds(64, 196, 60, 29);
		contentPane.add(button_9);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.plus();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		btnNewButton_1.setBounds(187, 108, 96, 29);
		contentPane.add(btnNewButton_1);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.minus();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		button_11.setBounds(187, 138, 96, 29);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.mult();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		button_12.setBounds(187, 167, 96, 29);
		contentPane.add(button_12);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.equals();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		button_14.setBounds(2, 228, 186, 29);
		contentPane.add(button_14);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculator.clear();
				textArea.setText(String.valueOf(calculator.getResult()));
			}
		});
		btnC.setBounds(187, 228, 96, 29);
		contentPane.add(btnC);
		
		
	}
}
