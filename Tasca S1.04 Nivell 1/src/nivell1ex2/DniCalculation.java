package nivell1ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DniCalculation {
	
	
	public int typeDni() {
		int maxDigitCount = 8; //Change this to limit amount of digits in int
		Scanner sc = new Scanner(System.in);
		System.out.println("Type (only) the numbers of your ID");
		int id = sc.nextInt();
		int length = String.valueOf(id).length();
		while(length > maxDigitCount) {
			id = sc.nextInt();
		    length = String.valueOf(id).length();
		}
		sc.close();
		
		return id;
	
	}
	
	public static char calculateLetter(int id) {
		int idLetter = id%23;
		
		ArrayList<Character> lettersTable = new ArrayList<>();
		lettersTable.addAll(Arrays.asList('T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',	'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' ));
		
		return lettersTable.get(idLetter);
	}

}
