

//class that returns value, depending on function called.
public class Methods {
	private static final double USD_TO_CAD = 1.26;
	private static final double CAD_TO_USD = 0.79;
	private static final double CAD_TO_POUNDS = 0.61;
	private static final double POUNDS_TO_CAD = 1.63;
	private static final double MILES_TO_KILOMETERS = 1.60934;
	private static final double KILOMETERS_TO_MILES = 0.621371;
	private static final double METERS_TO_MILES = 0.000621371;
	private static final double MILES_TO_METERS = 1609.34;
	private static final double DAYS_TO_SECONDS = 86400;
	private static final double SECONDS_TO_DAYS = 0.0000115741;
	private static final double GRAMS_TO_OUNCES = 0.035274;
	private static final double OUNCES_TO_GRAMS = 28.2495;
	private static final double GRAMS_TO_POUNDS = 0.00220462;
	private static final double POUNDS_TO_GRAMS = 453.592;

	public static double add(double a, double b) {
		return a + b;
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static double subtract(double a, double b) {
		double sum = a - b;
		return sum;
	}

	public static double subtract(int a, int b) {
		return a - b;
	}

	public static String divide(double a, double b) {
		return Double.toString(a / b);
	}

	public static double multiply(double a, double b) {
		if ((a == 0) || (b == 0)) {
			return 0;
		}
		return b + multiply(a - 1, b);
	}

	public static double cadToUsd(double a) {
		return a * CAD_TO_USD;
	}

	public static double usdToCad(double a) {
		return a * USD_TO_CAD;
	}

	public static double milesToKilometers(double a) {
		return a * MILES_TO_KILOMETERS;
	}

	public static double kilometersToMiles(double a) {
		return a * KILOMETERS_TO_MILES;
	}

	public static double metersToMiles(double a) {
		return a * METERS_TO_MILES;
	}

	public static double milesToMeters(double a) {
		return a * MILES_TO_METERS;
	}

	public static double daysToSeconds(double a) {
		return a * DAYS_TO_SECONDS;
	}

	public static double secondsToDays(double a) {
		return a * SECONDS_TO_DAYS;
	}

	public static double gramsToOunces(double a) {
		return a * GRAMS_TO_OUNCES;
	}

	public static double ouncesToGrams(double a) {
		return a * OUNCES_TO_GRAMS;
	}

	public static double gramsToPounds(double a) {
		return a * GRAMS_TO_POUNDS;
	}

	public static double poundsToGrams(double a) {
		return a * POUNDS_TO_GRAMS;
	}

	public static Object cadToPounds(double a) {
		return a * Methods.CAD_TO_POUNDS;
	}

	public static Object poundsToCad(int a) {
		return Methods.POUNDS_TO_CAD;
	}

}
