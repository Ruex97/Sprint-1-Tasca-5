package nivell1ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DniCalculationTest {

	@ParameterizedTest
	@CsvSource ({"49348296, W", "22383381, B", "34742744, W", "91603838, J", "52154994,X", "58346656, A", 
		"83198714, D", "17982176, V", "57560209, H", "87414165, C"})
	
	void IdLetterCalculationIsCorrect(int number, char letter) {
		assertEquals(DniCalculation.calculateLetter(number), letter);;
		
	}

}
