
public abstract class Animal {

	//variabler
	private String latinName;
	private String friendlyName;
	
	//konstruktor
	public Animal (String latinName) {
		this.latinName = latinName;
		}
	
	//getter
	public abstract String getInfo();
	
	//setter
	public void setFriendlyName(String friendlyName){
		this.friendlyName = friendlyName;
	}
	
	//getter
	public String getFriendlyName() {
		return friendlyName;
	}
	
	//getter
	public String getLatinName() {
		return latinName;
	}
	
	
	
}
