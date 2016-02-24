import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class GUIskanetrafiken extends JFrame {

	private JPanel contentPane;
	private JTextField searchField;
	private JLabel txtSk;
	private JLabel txtResultat;
	private JTextField textFrom;
	private JTextField textTo;
	private JLabel txtResaFrn;
	private JLabel txtResaTill;
	private JButton btnNewButton;
	private JLabel lblResultatResml;
	private JTextArea resultField2;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIskanetrafiken frame = new GUIskanetrafiken();
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
	public GUIskanetrafiken() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		searchField = new JTextField();
		searchField.setBounds(108, 150, 234, 31);
		contentPane.add(searchField);
		searchField.setColumns(10);
		
		txtSk = new JLabel();
		txtSk.setText("sök hållplats");
		txtSk.setBounds(108, 124, 130, 26);
		contentPane.add(txtSk);
		
		txtResultat = new JLabel();
		txtResultat.setText("Resultat hållplats");
		txtResultat.setBounds(0, 349, 130, 26);
		contentPane.add(txtResultat);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(108, 314, 409, 77);
		contentPane.add(scrollPane_1);
		
		final JTextArea resultField = new JTextArea();
		scrollPane_1.setViewportView(resultField);
		resultField.setEditable(false);
		
		JButton searchButton = new JButton("sök hållplats");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clear result.
				 resultField.setText("");
				 
				 // Create a list for holding Stations. 
				ArrayList<Station> searchStations = new ArrayList<Station>(); 
				 
				 // Search for all stations that contains the value of txtSearch and add the to the list searchStations.
				 searchStations.addAll(Parser.getStationsFromURL(searchField.getText().trim()));
				 for (Station s: searchStations){
				 resultField.append(s.getStationName() +" number:" + s.getStationNbr() + 
				 " longitude: " + s.getLongitude() + " latitude: " + s.getLatitude() + "\n");
				 }
				 }
				 	});
			
		searchButton.setBounds(387, 131, 117, 81);
		contentPane.add(searchButton);
		
		
		
		textFrom = new JTextField();
		textFrom.setBounds(34, 62, 130, 26);
		contentPane.add(textFrom);
		textFrom.setColumns(10);
		
		textTo = new JTextField();
		textTo.setColumns(10);
		textTo.setBounds(212, 62, 130, 26);
		contentPane.add(textTo);
		
		txtResaFrn = new JLabel();
		txtResaFrn.setText("resa från");
		txtResaFrn.setBounds(54, 40, 130, 26);
		contentPane.add(txtResaFrn);
		
		txtResaTill = new JLabel();
		txtResaTill.setText("resa till");
		txtResaTill.setBounds(222, 41, 130, 26);
		contentPane.add(txtResaTill);
		
		btnNewButton = new JButton("sök resa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Clear result.
				 resultField2.setText("");
				 				
				 // Create a list for holding Stations. 
				 ArrayList<Station> searchStations = new ArrayList<Station>();
				 
				 // Find station numbers.
				 String fromNbr = "80000";
				 String toNbr = "81216";
				 // Search for all stations that contains the value of txtSearch and add the to the list searchStations.
				 searchStations.addAll(Parser.getStationsFromURL(textFrom.getText().trim()));
				 for (Station s: searchStations){
				 // Find station number.
				 }
				 
				 // Construct the query URL for searching.
				 String searchURL = Constants.getURL(fromNbr, toNbr, 1);
				 
				 // Call the Skanetrafiken API with the constructed query URL to retrieve a list of available journeys.
				 Journeys journeys = Parser.getJourneys(searchURL);
				 
				 for (Journey journey : journeys.getJourneys()) {
				 resultField2.append(journey.getStartStation().toString() + " - ");
				 resultField2.append(journey.getEndStation().toString());
				 String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":" + journey.getDepDateTime().get(Calendar.MINUTE);
				 resultField2.append(" Departs " + time + " that is in " + journey.getTimeToDeparture() + " minutes. And it is " + journey.getDepTimeDeviation() + " min late\n");
				 				} 
				 			}
				 		});
			
		btnNewButton.setBounds(387, 27, 117, 64);
		contentPane.add(btnNewButton);
		
		lblResultatResml = new JLabel();
		lblResultatResml.setText("Resultat resmål");
		lblResultatResml.setBounds(0, 247, 130, 26);
		contentPane.add(lblResultatResml);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 224, 409, 77);
		contentPane.add(scrollPane);
		
		resultField2 = new JTextArea();
		scrollPane.setViewportView(resultField2);
		resultField2.setEditable(false);
		
		
	}

}
