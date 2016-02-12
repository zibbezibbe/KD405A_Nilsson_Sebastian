
public abstract class Mammal extends Animal {
	
	//variabel
	private int gestationTime;
	
	//konstruktor
	public Mammal(String latinName, int gestationTime ){
		super (latinName);
		this.gestationTime = gestationTime;
		
	}
	
	//getter
	public int getGestationTime() {
		return gestationTime;
	}

}
