package nivell1ex3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InventoryTest {

	@Test
	// expected ArrayIndexOutOfBoundsException
	void throwsArrayIndexOutOfBoundsException() {
		Inventory products = new Inventory();
		products.addFiveFruits();
		products.getIndexFive();
	}

}
