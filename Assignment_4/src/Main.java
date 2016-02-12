

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main extends JFrame {

private JPanel contentPane;
private JTextField humanField;
private JTextField dogField;
Human human;


public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
 try {
				Main frame = new Main();
 				frame.setVisible(true);
			} catch (Exception e) {
 				e.printStackTrace();
 			}
 		}
 	});
 }

 	public Main() {
 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	setBounds(100, 100, 450, 300);
 	contentPane = new JPanel();
 	contentPane.setBackground(Color.LIGHT_GRAY);
 	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 	setContentPane(contentPane);
 	contentPane.setLayout(null);

 	humanField = new JTextField();
 	humanField.setBounds(6, 29, 130, 26);
 	contentPane.add(humanField);
 	humanField.setColumns(10);

 	dogField = new JTextField();
 	dogField.setBounds(6, 67, 130, 26);
 	contentPane.add(dogField);
 	dogField.setColumns(10);
 
 
 
 
 JTextArea infoArea = new JTextArea();
 infoArea.setBounds(6, 149, 438, 48);
 contentPane.add(infoArea);
 	
 JLabel lblInfo = new JLabel("Info");
 lblInfo.setBounds(6, 132, 61, 16);
 contentPane.add(lblInfo);
 
 JTextArea errorArea = new JTextArea();
 errorArea.setBounds(6, 224, 438, 48);
 contentPane.add(errorArea);
 
 /**HUMAN RUTAN KOMMANDO*/
 JLabel lblError = new JLabel("Error");
 lblError.setBounds(6, 209, 61, 16);
 contentPane.add(lblError);
 
 JButton humanButton = new JButton("New Human");
 		humanButton.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
             
 			//kollar om human har mer än tre bokstäver och skapar isåfall en ny human	
 			if(humanField.getText().length()>3){
             human = new Human(humanField.getText());
             }
 			
 			//om det är mindre än tre bokstäver skrivs ett felmeddelande ut
            if (humanField.getText().length()<3){
             	errorArea.setText("Namnet måste vara längre än 3 bokstäver");
             	
             }
 			}
 		});
 		humanButton.setBounds(148, 29, 117, 29);
 		contentPane.add(humanButton);
 		JButton dogButton = new JButton("Buy Dog");
 		dogButton.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 			
 			//skapar en ny hund om det finns en ägare till den, annars felmeddelande
 			errorArea.setText("");
 			Dog dog = new Dog(dogField.getText());
 			
 			human.buyDog(dog);
 				
 			}
 		});
 		dogButton.setBounds(148, 67, 117, 29);
 		contentPane.add(dogButton);
 
 		JButton infoButton = new JButton("Print Info");
 		infoButton.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
          
 				
 				//skriver ut informationen i textrutan
 				infoArea.setText(human.getInfo());
         	   
         	 
            }
 			}
 		);
 		infoButton.setBounds(148, 108, 117, 29);
 		contentPane.add(infoButton);
 	}
 
 }