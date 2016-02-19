import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockLogic  {

	//variabler
	private Calendar cal = Calendar.getInstance();
	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinutes;
	private ClockThread Thread;
	
	//konstruktor
	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		this.clockGUI = digitalClockGUI;
		
		new ClockThread().start(); 
	}
		
	
	//metod för att sätta alarmet
	public void setAlarm(int hours, int minutes){
		
		
		
		if((hours >= 0) && (hours < 24) ){
			alarmHour = hours;
		} else {
			alarmHour = -1;
		}
		
		if((minutes >= 0) && (minutes < 60) ){
			alarmMinutes = minutes;
		} else {
			alarmMinutes = -1;
		}
		
		
		
		
		if((alarmHour >= 0) && (alarmMinutes >= 0))
		{
			//lägger till decimal, tar bort alarmtiden när alarmet nollställs
        	DecimalFormat decimalFormat = new DecimalFormat("00");
			
			

			clockGUI.setAlarmOnLabel("" + decimalFormat.format(hours) + ":" + decimalFormat.format(minutes));
		}
		else
		{
			clockGUI.setAlarmOnLabel("" + " ");
		}
		
		
	}
	
	//nollställer alarmet
	public void clearAlarm(){
		
        setAlarm(-1, -1);
		
		clockGUI.activateAlarm(false);
	}
	
	//kör klockan så att den inte står stilla
	private class ClockThread extends Thread{
				
		        @Override
				public void run(){
		        	
		        	DecimalFormat decimalFormat = new DecimalFormat("00");
						
						while(true) {
							
						Calendar cal = Calendar.getInstance();
						
						int second = cal.get(Calendar.SECOND);
						int minute = cal.get(Calendar.MINUTE);
						int hour = cal.get(Calendar.HOUR_OF_DAY);
						
						clockGUI.setTimeOnLabel("" + decimalFormat.format(hour) + ":" +decimalFormat.format(minute) + ":" + decimalFormat.format(second));
						
						//aktiverar alarmet
						if((hour == alarmHour && minute == alarmMinutes)) {
							
							clockGUI.activateAlarm(true);
							
						}else{
							
							clockGUI.activateAlarm(false);
						}
						
						try {
							Thread.sleep(900);
						
					} catch (InterruptedException e) {
						e.printStackTrace();
						return;
					}
						
						
		
					}
				}
			}
	}
	

