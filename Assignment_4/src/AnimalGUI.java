import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AnimalGUI extends JFrame {

	//lista med alla djur 
	private JPanel contentPane;
	private ArrayList <Animal> allAnimals;{
		allAnimals = new ArrayList<Animal>();{
			allAnimals.add(new Snake("väsilis kuzilis", false));
			allAnimals.add(new Snake("sssmukulumus ormulusisis", true));
			allAnimals.add(new Snake("pytonianis bokilosituos", false));
			allAnimals.add(new Cat("mjaus kissimissis", 5, 7));
			allAnimals.add(new Cat("kissifjau muzilis", 8, 12));
			allAnimals.add(new Cat("kattisaron bukakulus", 2, 6));
			allAnimals.add(new Dog1("voffus brockus", 10, false, "Krösus"));
			allAnimals.add(new Dog1("dronkelius smiskus", 3, true, "Urban"));
			allAnimals.add(new Dog1("lassimon stroppus", 4, true, "Brunki"));
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
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
	public AnimalGUI() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(18, 42, 399, 163);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		//skriver ut djuren i en textruta
		String a = "";
		
		for (Animal all : allAnimals){
			
			a = a + (all.getInfo()) + "\n";
			}
		textArea.setText(a);
		
		
		
		
	}

}
