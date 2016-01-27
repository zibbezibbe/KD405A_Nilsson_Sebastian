package se.mah.ke.SebastianNilsson;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.BoxLayout;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class Assignment1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment1 frame = new Assignment1();
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
	public Assignment1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlemmar = new JMenu("Medlemmar");
		menuBar.add(mnMedlemmar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Ny medlem");
		mnMedlemmar.add(mntmNewMenuItem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMedlemmar.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hjälp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hjälp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);
		
		JTextPane txtpnSebastianNilsson = new JTextPane();
		txtpnSebastianNilsson.setFont(new Font("Myriad Pro", Font.PLAIN, 40));
		txtpnSebastianNilsson.setText("SEBASTIAN NILSSON");
		scrollPane.setColumnHeaderView(txtpnSebastianNilsson);
	}

}
