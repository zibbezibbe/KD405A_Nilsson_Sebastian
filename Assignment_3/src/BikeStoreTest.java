import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class BikeStoreTest extends JFrame { 
	
	private JPanel contentPane;
	private JLabel txtPrice;
	private JLabel txtSize;
	private JLabel txtColor;
	private JTextField PriceField;
	private JTextField SizeField;
	private JTextField ColorField;
	private int setSize = 0;
	private int setPrice = 0;
	private String setColor = "color";
	
	ArrayList<Bike> bikeStore = new ArrayList<Bike>();
	private JScrollPane scrollPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreTest frame = new BikeStoreTest();
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
	public BikeStoreTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 21, 407, 93);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
		/**när knappen add bike är intryckt lägger den in värdena för size,price och colour i listan för cyklar */
		JButton btnNewButton = new JButton("Add bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				checkThisColor();
				
				/**kollar om värdena är godkända*/
				if (constants.getCheckedColor(setColor) == true) {
					checkThisPrice();
					checkThisSize();

					setSize = checkSize(setSize);

					setPrice = checkPrice(setPrice);

					bikeStore.add(new Bike(setColor, setPrice, setSize));
					for (int i = 0; i < bikeStore.size(); i++) {
						textArea.append(bikeStore.get(i).getColor() + "\t" + bikeStore.get(i).getPrice() + "\t"
								+ bikeStore.get(i).getSize() + "\n");
					}
				/**skriver ut ett felmeddelande när värdena för size,price och color inte är godkända*/	
				} else {
					textArea.setText("inte godkänd");
				}

			}
		});
		btnNewButton.setBounds(17, 140, 135, 109);
		contentPane.add(btnNewButton);
		
		txtPrice = new JLabel();
		txtPrice.setText("Price");
		txtPrice.setBounds(190, 140, 80, 26);
		contentPane.add(txtPrice);
		
		txtSize = new JLabel();
		txtSize.setText("Size");
		txtSize.setBounds(190, 180, 80, 26);
		contentPane.add(txtSize);
		
		txtColor = new JLabel();
		txtColor.setText("Color");
		txtColor.setBounds(190, 223, 80, 26);
		contentPane.add(txtColor);
		
		PriceField = new JTextField();
		PriceField.setBounds(282, 140, 142, 26);
		contentPane.add(PriceField);
		PriceField.setColumns(10);
		
		SizeField = new JTextField();
		SizeField.setColumns(10);
		SizeField.setBounds(282, 180, 142, 26);
		contentPane.add(SizeField);
		
		ColorField = new JTextField();
		ColorField.setColumns(10);
		ColorField.setBounds(282, 223, 142, 26);
		contentPane.add(ColorField);
		
	}

/**input för price*/
private void checkThisPrice() {
	String text = PriceField.getText();
	setPrice = Integer.parseInt(text);
}

/**input för size*/
private void checkThisSize() {
	String text = SizeField.getText();
	setSize = Integer.parseInt(text);
}

/**input för colour*/
private void checkThisColor() {
	setColor = ColorField.getText();

}

/**ändrar värdet för price om det är för stort eller för litet till det maximala eller minimala godkända värdet*/
public int checkPrice(int exPrice) {
	if (exPrice < constants.MIN_PRICE) {
		exPrice = constants.MIN_PRICE;
		return exPrice;
	} else if (exPrice > constants.MAX_PRICE) {
		exPrice = constants.MAX_PRICE;
		return exPrice;
	} else {
		return exPrice;
	}
}

/**ändrar värdet för size om det är för stort eller för litet till det maximala eller minimala godkända värdet*/
public int checkSize(int exSize) {
	if (exSize < constants.MIN_SIZE) {
		exSize = constants.MIN_SIZE;
		return exSize;
	} else if (exSize > constants.MAX_SIZE) {
		exSize = constants.MAX_SIZE;
		return exSize;
	} else {
		return exSize;
	}
}
}