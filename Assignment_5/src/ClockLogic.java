import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockLogic  {

	private Calendar cal = Calendar.getInstance();
	private DigitalClockGUI clockGUI;
	private int alarmHour;
	private int alarmMinutes;
	private ClockThread Thread;
	
	
	public ClockLogic(DigitalClockGUI digitalClockGUI) {
		this.clockGUI = digitalClockGUI;
		
		new ClockThread().start(); 
	}
		
	
	
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
			
			

			clockGUI.setAlarmOnLabel("" + hours + ":" + minutes);
		}
		else
		{
			clockGUI.setAlarmOnLabel("" + " ");
		}
		
		
	}
	
	
	public void clearAlarm(){
		
        setAlarm(-1, -1);
		
		clockGUI.activateAlarm(false);
	}
	
	
	private class ClockThread extends Thread{
				
		        @Override
				public void run(){
						
						while(true) {
							
						Calendar cal = Calendar.getInstance();
						
						int second = cal.get(Calendar.SECOND);
						int minute = cal.get(Calendar.MINUTE);
						int hour = cal.get(Calendar.HOUR_OF_DAY);
						
						clockGUI.setTimeOnLabel("" + hour + ":" + minute + ":" + second);
						
						
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
	

