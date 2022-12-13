package assertJTesting;



import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;


import org.junit.Test;

import exercice1n2n3.MyInteger;

import exercice4.Cake;
import exercice4.Dog;
import exercice4.Glasses;
import exercice4.Guitar;


public class assertJTests {
	
	MyInteger myNum = new MyInteger(4);
	MyInteger myNum2 = new MyInteger(12);
	MyInteger myNum3= new MyInteger(4);
	MyInteger myNum4 = myNum;
	
	

	@Test
	public void fourAndTwelveShouldNotEqual() {
		assertThat(myNum.getI()).isNotEqualTo(myNum2.getI());
	}
	
	@Test
	public void fourAndFourShouldBeEqual() {
		assertThat(myNum.getI()).isEqualTo(myNum3.getI());
	}
	
	// Exercice 2:
	
	@Test
	public void myNumAndMyNum3ShouldNotEqual() {
		assertThat(myNum).isNotEqualTo(myNum3);   // Even they have same value, memory value doesn't match
	}
	
	@Test
	public void myNumAndMyNum4ShouldBeEqual() {
		assertThat(myNum).isEqualTo(myNum4);
	}
	
	// Exercice 3:
	
	@Test
	public void twoArraysWithSameValuesShouldBeEqual() {
		assertThat(MyInteger.arrayInts()).isEqualTo(MyInteger.arrayInts2());	
	
	}
	
	@Test
	public void twoArraysWithSameIndexAndDifferentValuesShouldNotBeEqual() {
		assertThat(MyInteger.arrayInts()).isNotEqualTo(MyInteger.arrayInts3());
		
	}
	
	//Exercice 4:
	
	@Test
	public void elementsShouldBeSortedAsAdded() {
		Guitar myGuitar = new Guitar("Spanish guitar");
		Dog myDog = new Dog("greyhound");
		Cake myCake = new Cake("Chocolate", 15);
		
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(myGuitar);
		myList.add(myCake);
		myList.add(myDog);

		assertThat(myList).containsExactly(myGuitar, myCake, myDog);
		
	}
	
	@Test
	public void ArrayListContainsOnlySpecifiedElements() {
		Guitar myGuitar = new Guitar("Spanish guitar");
		Dog myDog = new Dog("greyhound");
		Cake myCake = new Cake("Chocolate", 15);
		
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(myGuitar);
		myList.add(myCake);
		myList.add(myDog);

		assertThat(myList).containsOnly(myGuitar, myCake, myDog);
		
	}
	
	@Test
	public void ArrayListContainsOnlyOneGuitarAndDontContainCake() {
		Guitar myGuitar = new Guitar("Spanish guitar");
		Dog myDog = new Dog("greyhound");
		Dog myDog2 = new Dog("dogo");
		Cake myCake = new Cake("Chocolate", 15);
		Glasses myGlasses = new Glasses("Rayban", 120);
		
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add(myGuitar);
		myList.add(myGlasses);
		myList.add(myDog);
		myList.add(myDog2);

		assertThat(myList).containsOnlyOnce(myGuitar)
						  .contains(myDog, myDog2, myGlasses)
						  .doesNotContain(myCake);
		
	}
	
	// Exercice 5:
	@Test
	public void HashMapContainsKey() {
	HashMap<String, String> myMap = new HashMap<String, String>();
	myMap.put("Madrid", "España");
	myMap.put("Paris", "Francia");
	myMap.put("Berlin", "Alemania");
	myMap.put("Viena", "Austria");
	myMap.put("Roma", "Paris");
	
	assertThat(myMap).containsKey("Madrid");
	
	}
	
	//Exercice 6:
	@Test
	public void arrayExceptionTest() {
		int[] array = {3,4,2};
		
		assertThrows(ArrayIndexOutOfBoundsException.class, 
						() -> {int value = array[4];});
	}
		
	

	
	// Exercice 7:
	@Test
	public void OptionalObjectShouldEquallNull() {
		
		Optional optional = Optional.empty();
		
		assertFalse(optional.isPresent());
		
	
		
	}

	
	
	
	
	
	

}
