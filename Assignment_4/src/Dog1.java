
public class Dog1 extends Mammal {
	
	//variabel
	private boolean stupid;
	
	//konstruktor
	public Dog1(String latinName, int gestationTime, boolean stupid){
		super (latinName, gestationTime);
		this.stupid = stupid;
	}
	
	//konstruktor
	public Dog1(String latinName, int gestationTime, boolean stupid, String friendlyName){
		super (latinName, gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}
	
	
	public boolean isStupid(){
		return this.stupid;
	}
	
	//metod för att skriva ut information om hunden samt kolla om den är smart eller dum
	public String getInfo() {
		String info;
		if (isStupid() == false) {
			
		info = "Denna hund har det latinska namnet " + getLatinName() + " är dräktig i " + getGestationTime() + " månader " + " är klyftig" + " och kallas " + getFriendlyName();
		
		} else {
		
			info = "Denna hund har det latinska namnet " + getLatinName() + " är dräktig i " + getGestationTime() + " månader " + " är inte alls klyftig" + " och kallas " + getFriendlyName();
		}
		return info;
		}

}
