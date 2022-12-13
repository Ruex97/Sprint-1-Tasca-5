package nivell1ex1;

import java.util.ArrayList;

public class Year {
	private static final ArrayList<String> MONTHS = monthsOfTheYear();
	
	public Year () {
		
	}
	public static ArrayList<String> getMonths() {
		return MONTHS;
	}

	
	
	public static ArrayList<String> monthsOfTheYear() {
		ArrayList<String> allMonths = new ArrayList<String>();
		allMonths.add("January");
		allMonths.add("February");
		allMonths.add("March");
		allMonths.add("April");
		allMonths.add("May");
		allMonths.add("June");
		allMonths.add("July");
		allMonths.add("August");
		allMonths.add("September");
		allMonths.add("October");
		allMonths.add("November");
		allMonths.add("December");
		return allMonths;
	}

	public static Integer size() {
		return MONTHS.size();
	}
	
	

}
