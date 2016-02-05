
public class Bike {  
	
	
/**initialiserar klassen*/
public String color;
public int price;
public int size;

/**konstruktor*/
public Bike(String color, int size) {
	this.color = color;
	this.size = size;
}

/**konstruktor*/
public Bike(String color, int size, int price) {
	this.color = color;
	this.size = size;
	this.price = price;
}

/**getter*/
public int getPrice() {
	return this.price;
}

/**setter*/
public void setPrice(int price) {
	this.price = price;
}

/**getter*/
public String getColor() {
	return this.color;
}

/**getter*/
public int getSize() {
	return this.size;
}

}
