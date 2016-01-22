package se.mah.ke.SebastianNilsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.List;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtElvisBrosk;
	private JTextField textField;
	private JTextField txtKrkgatan;
	private JTextField txtGrtje;
	private JTextField txtElvanhotmailcom;
	private JTextField textField_4;
	private JTextField txtAdress;
	private JTextField txtPersonnummer;
	private JTextField txtEmail;
	private JTextField txtTelefon;
	private JTextField txtTelefon_1;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 305);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv Ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("Medlemmar");
		menuBar.add(mnMedlemmar);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMedlemmar.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlemmar.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		
		JLabel lblNewLabel_2 = new JLabel("                                                                  ");
		menuBar.add(lblNewLabel_2);
		
		JButton btnSave = new JButton("Save");
		menuBar.add(btnSave);
		btnSave.setForeground(Color.RED);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 19, 106, 215);
		contentPane.add(scrollPane);
		
		JTextArea txtrAdamKuzi = new JTextArea();
		txtrAdamKuzi.setEditable(false);
		txtrAdamKuzi.setText("Adam kuzi\nBrunki Muzi\nSunki Druzi\nK3 Larra\nC3 Larra\nBörje Surström\nDisco Bursörj\nSisko Lökstam\nYvor Klunk\nAsp Berger\nSörje Sunk\nDonald Trumpet\nArnold Svarnold\nKonrad Svisk\nElvis Brosk\nRönke Kask\nOrvar Sörensko\nPerko Pisk");
		scrollPane.setViewportView(txtrAdamKuzi);
		
		txtElvisBrosk = new JTextField();
		txtElvisBrosk.setBorder(null);
		txtElvisBrosk.setForeground(Color.BLACK);
		txtElvisBrosk.setFont(new Font("American Typewriter", Font.PLAIN, 30));
		txtElvisBrosk.setHorizontalAlignment(SwingConstants.CENTER);
		txtElvisBrosk.setEditable(false);
		txtElvisBrosk.setText("Elvis Brosk");
		txtElvisBrosk.setBounds(134, 20, 183, 26);
		contentPane.add(txtElvisBrosk);
		txtElvisBrosk.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("                                        ");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon("/Users/Sebastian/Documents/creep.png"));
		lblNewLabel.setBounds(144, 58, 183, 176);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		textField.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField.setBounds(417, 86, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtKrkgatan = new JTextField();
		txtKrkgatan.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		txtKrkgatan.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtKrkgatan.setBounds(417, 118, 117, 20);
		contentPane.add(txtKrkgatan);
		txtKrkgatan.setColumns(10);
		
		txtGrtje = new JTextField();
		txtGrtje.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		txtGrtje.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtGrtje.setBounds(417, 150, 117, 20);
		contentPane.add(txtGrtje);
		txtGrtje.setColumns(10);
		
		txtElvanhotmailcom = new JTextField();
		txtElvanhotmailcom.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtElvanhotmailcom.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		txtElvanhotmailcom.setBounds(417, 182, 117, 20);
		contentPane.add(txtElvanhotmailcom);
		txtElvanhotmailcom.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Myriad Pro", Font.PLAIN, 14));
		textField_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		textField_4.setBounds(417, 214, 117, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setBorder(null);
		txtAdress.setText("Namn:");
		txtAdress.setBounds(353, 86, 75, 20);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtPersonnummer = new JTextField();
		txtPersonnummer.setText("Adress:");
		txtPersonnummer.setColumns(10);
		txtPersonnummer.setBorder(null);
		txtPersonnummer.setBounds(353, 118, 106, 20);
		contentPane.add(txtPersonnummer);
		
		txtEmail = new JTextField();
		txtEmail.setText("Ort:");
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(353, 149, 106, 20);
		contentPane.add(txtEmail);
		
		txtTelefon = new JTextField();
		txtTelefon.setText("E-mail:");
		txtTelefon.setColumns(10);
		txtTelefon.setBorder(null);
		txtTelefon.setBounds(353, 182, 106, 20);
		contentPane.add(txtTelefon);
		
		txtTelefon_1 = new JTextField();
		txtTelefon_1.setText("Telefon:");
		txtTelefon_1.setColumns(10);
		txtTelefon_1.setBorder(null);
		txtTelefon_1.setBounds(353, 214, 106, 20);
		contentPane.add(txtTelefon_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("/Users/Sebastian/Documents/logo gym.gif"));
		lblNewLabel_1.setBounds(339, 19, 205, 52);
		contentPane.add(lblNewLabel_1);
	}
}
