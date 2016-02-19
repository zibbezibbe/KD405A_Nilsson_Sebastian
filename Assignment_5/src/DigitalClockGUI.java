import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JLabel txtHour;
	private JLabel txtMinute;
	private JTextField HourField;
	private JTextField MinuteField;
	private boolean alarmOn = false;
	private ClockLogic clockLogic;
	private JLabel currentTime;
	private JLabel alarmLabel;
	private JLabel alarmMessage;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		setTitle("AlarmClock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHour = new JLabel();
		txtHour.setText("Hour");
		txtHour.setBounds(19, 185, 75, 26);
		contentPane.add(txtHour);
		
		txtMinute = new JLabel();
		txtMinute.setText("Minutes");
		txtMinute.setBounds(19, 232, 75, 26);
		contentPane.add(txtMinute);
		
		HourField = new JTextField();
		HourField.setBounds(80, 185, 83, 26);
		contentPane.add(HourField);
		HourField.setColumns(10);
		
		MinuteField = new JTextField();
		MinuteField.setColumns(10);
		MinuteField.setBounds(80, 232, 83, 26);
		contentPane.add(MinuteField);
	
		//sätter alarmet, hämtar texten i minut och timfältet
		JButton AlarmButton = new JButton("Set Alarm");
		AlarmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int hours;
				int minute;
				try {
					hours = Integer.parseInt(HourField.getText());
					minute = Integer.parseInt(MinuteField.getText());
					clockLogic.setAlarm(hours, minute);
				} catch(NumberFormatException ex) {
					
					
					
				}
			}
			
		});
		AlarmButton.setBounds(187, 185, 117, 73);
		contentPane.add(AlarmButton);
		
		//nollställer alarmet
		JButton ClearButton = new JButton("Clear Alarm");
		ClearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clockLogic.clearAlarm();
			}
		});
		ClearButton.setBounds(316, 185, 117, 73);
		contentPane.add(ClearButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/Users/Sebastian/Downloads/klocka.png"));
		lblNewLabel.setBounds(6, 6, 40, 39);
		contentPane.add(lblNewLabel);
		
		currentTime = new JLabel("");
		currentTime.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		currentTime.setBounds(80, 60, 279, 51);
		contentPane.add(currentTime);
		
		alarmLabel = new JLabel("");
		alarmLabel.setBounds(80, 123, 94, 16);
		contentPane.add(alarmLabel);
		
		alarmMessage = new JLabel("");
		alarmMessage.setBounds(265, 123, 168, 16);
		contentPane.add(alarmMessage);
		
		//skapar en ny instans av clocklogic
		clockLogic = new ClockLogic(this);
		
	}
	
	//sätter tiden i klockfältet
	public void setTimeOnLabel(String time){
		currentTime.setText(time);
		
	}
	
	//sätter alarmet i alarmfältet
	public void setAlarmOnLabel(String alarmTime){
		alarmLabel.setText(alarmTime);
	}
	
	//skriver ut en text när alarmet går
	public void activateAlarm(boolean activate) {
		if(activate)
		{
			
			alarmMessage.setText(" dags att vakna ");
			
		}else{
			
			alarmMessage.setText(" ");
		}
	}
		
		
	}	
	


