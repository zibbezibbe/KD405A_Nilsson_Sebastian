public class House{
private int yearBuilt;
private int size;
private static int minSize = 10;
private static int maxSize = 1000;
private static int minYearBuilt = 1800;
private static int maxYearBuilt = 2005;

public House(int yearBuilt,int size){
	this.yearBuilt = yearBuilt;
	this.size = size;
}

public int getYearBuilt(){
	return this.yearBuilt;
}
public int getSize(){
	return this.size;
}

public static int getMinSize(){
	return minSize;
}

public static int getMaxSize(){
	return maxSize;
}

public static int getMinYearBuilt(){
	return minYearBuilt;
}

public static int getMaxYearBuilt(){
	return maxYearBuilt;
}
}