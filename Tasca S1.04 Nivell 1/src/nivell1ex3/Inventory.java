package nivell1ex3;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
		private ArrayList<String> products;
		
		public Inventory() {
			products = new ArrayList<>();
			
		}
		
		// Getters
		public ArrayList<String> getProducts(){
			return products;
		}
		
		// Setters
		public void setProductes(ArrayList<String> products) {
			this.products = products;
		}
		
		
		public void addFiveFruits() {
			products.addAll(Arrays.asList("Banana", "Apple", "Pear", "Orange", "Pinneaple"));
		}
		
		public String getIndexFive() {
			String fruit = products.get(5);
			return fruit;
		}

	}


