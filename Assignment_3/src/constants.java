import java.util.Random;

public class constants {

/**deklarerar max och minimumvärden för price och size samt sant och falskt för colour*/
public static final int MIN_SIZE = 8;
public static final int MAX_SIZE = 28;
public static final int MIN_PRICE = 0;
public static final int MAX_PRICE = 30000;
public static boolean colorCheck = false;

/**array med färger som är godkända för cykelaffären*/
public static String[] bikeColors = new String[]{ "red", "green","black", "orange", "blue", "white", "purple", "green", "brass", "silver"};

/**testar om det är rätt färg*/
public static boolean getCheckedColor(String testcolor) {
	for (int i = 0; i < constants.bikeColors.length; i++) {
		if (constants.bikeColors[i].equals(testcolor)) {
			colorCheck = true;
			return colorCheck;
		} else {
			colorCheck = false;
		}
	}
	return colorCheck;

}
}


