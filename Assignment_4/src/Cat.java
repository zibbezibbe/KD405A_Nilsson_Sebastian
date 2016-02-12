
public class Cat extends Mammal {

	//variabel
	private int numberOfLives;
	
	//konstruktor
	public Cat(String latinName, int gestationTime, int numberOfLives){
		super (latinName, gestationTime);
		this.numberOfLives = numberOfLives;
	}
	
	//getter
	public int getNumberOfLives(){
		return numberOfLives;
	}
	
	//setter
	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	//metod för att hämta namn, dräktighetstid och antal liv
	public String getInfo() {
		
		String info;
		
			
		info = "Denna katt har det latinska namnet " + getLatinName() + " är dräktig i " + getGestationTime() + " månader " + " och har " + getNumberOfLives() + " liv ";
			
		return info;
	}
}
