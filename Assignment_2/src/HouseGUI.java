import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouses;
	private int randomYear;
	private int randomSize;
	private Random random = new Random();
	private ArrayList<House> houselist = new ArrayList<House>();
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(83, 10, 300, 220);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		scrollPane.setViewportView(textArea);
		
		textArea.append("Uppgift 1.2" + "\n");
		
		House myHouse1 = new House(1800, 100);
		House myHouse2 = new House(1850, 900);
		House myHouse3 = new House(1970, 300);
		
		textArea.append("House 1 is built " + myHouse1.getYear() + " and is " + myHouse1.getSize() + " kvadratmeter stort" + "\n");
		textArea.append("House 2 is built " + myHouse2.getYear() + " and is " + myHouse2.getSize() + " kvadratmeter stort" + "\n");
		textArea.append("House 3 is built " + myHouse3.getYear() + " and is " + myHouse3.getSize() + " kvadratmeter stort" + "\n");
		
		System.out.println("Uppgift 1.2");
		System.out.println("House 1 is built " + myHouse1.getYear() + " and is " + myHouse1.getSize() + " kvadratmeter stort");
		System.out.println("House 2 is built " + myHouse2.getYear() + " and is " + myHouse2.getSize() + " kvadratmeter stort");
		System.out.println("House 3 is built " + myHouse3.getYear() + " and is " + myHouse3.getSize() + " kvadratmeter stort");
		
		
		textArea.append("Uppgift 1.3" + "\n");
		System.out.println("Uppgift 1.3");
		myHouses = new House[10];
		
		myHouses[0] = new House(1999, 456);
		myHouses[1] = new House(1910, 97);
		myHouses[2] = new House(1950, 29);
		myHouses[3] = new House(1917, 197);
		myHouses[4] = new House(1923, 465);
		myHouses[5] = new House(1987, 297);
		myHouses[6] = new House(1964, 870);
		myHouses[7] = new House(1991, 450);
		myHouses[8] = new House(2001, 240);
		myHouses[9] = new House(2000, 100);
		
		for(int i=0; i <10; i++){
			textArea.append("House " + (i+1) + " is built " + myHouses[i].getYear() + " and is " + myHouses[i].getSize() + " kvadratmeter stort" + "\n");
			System.out.println("House " + (i+1) + " is built " + myHouses[i].getYear() + " and is " + myHouses[i].getSize() + " kvadratmeter stort" + "\n");
		}
		
		textArea.append("Uppgift 1.4" + "\n");
		System.out.println("Uppgift 1.4" + "\n");
		
		
		for(int i =0; i <100; i++){
			
			randomYear = random.nextInt(House.getMaxYear() - House.getMinYear() + 1) + House.getMinYear();
			randomSize = random.nextInt(House.getMaxSize() - House.getMinSize() + 1) + House.getMinSize();
			
			houselist.add(new House(randomYear, randomSize));
			
			System.out.println(houselist.get(i).getYear() + "\t" + (houselist.get(i).getSize()));
			textArea.append("House " + (i+1) + " is built " + houselist.get(i).getYear() + " and is " + houselist.get(i).getSize() + " kvm " + "\n");
			
		}
		
		
	}
}
