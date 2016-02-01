public class House{
private int year;
private int size;
private static int minSize = 10;
private static int maxSize = 1000;
private static int minYear = 1800;
private static int maxYear = 2005;

public House(int setYearBuilt,int setSize){
	if (setSize < minSize) {
		size = minSize+1;
		
	}else if (setSize > maxSize){
		size = maxSize-1;
		
	}else{
		size = setSize;
	}
	if (setYearBuilt < minYear){
		year = minYear+1;
		
	}else if (setSize > maxYear){
		year = maxYear-1;
		
	}else{
		year = setYearBuilt;
	}

}

public int getYear(){
	return this.year;
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

public static int getMinYear(){
	return minYear;
}

public static int getMaxYear(){
	return maxYear;
}
}