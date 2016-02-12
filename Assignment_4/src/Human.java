
public class Human {

	//variabler
	private String name;
	private Dog dog;
	
	//konstruktor
	public Human (String name) {
		this.name = name;
		}
	
	//getter
	public String getName() {
		return name;
	}
	
	//setter
	public void buyDog(Dog dog){
		this.dog = dog;
		
	}
	
	//metod som hämtar en ny hund om det finns en ägare
	public String getInfo() {
		
		if (dog == null) {
			String info = getName() + " äger inte en hund";
			return info;
		}else{
			String info = getName() + " äger en hund som heter " + dog.getDogName();
			return info;
		} 
		}
	
	}
	
	


