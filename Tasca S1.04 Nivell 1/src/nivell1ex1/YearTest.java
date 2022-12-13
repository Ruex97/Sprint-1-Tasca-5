package nivell1ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YearTest {

	@Test
	void YearHasTwelvePositions() {
		assertEquals(12, Year.size());
	}
	
	@Test 
	void YearHasAugustInPositionEight() {
		assertEquals("August", Year.getMonths().get(7));
	}
	
	@Test
	void YearIsNotEqualToNull() {
		assertNotEquals(Year.getMonths(), null);
	}

}
