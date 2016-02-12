
public class Snake extends Animal {
	
	//variabel
	private boolean poisonous;
	
	//konstruktor
	public Snake(String latinName, boolean poisonous){
		super (latinName);
		this.poisonous = poisonous;
	}
	
	public boolean isPoisonous(){
		return this.poisonous;
	}
	
	//skriver ut info om ormen samt kollar om den är giftig
	public String getInfo() {
		String info;
		if (isPoisonous() == false) {
			
		info = "Denna orm har det latinska namnet " + getLatinName() + " och är inte giftig! ";
		
		} else {
		
		info = "Denna orm har det latinska namnet " + getLatinName() + " och är mycket giftig! ";
		}
		return info;
		}

}
