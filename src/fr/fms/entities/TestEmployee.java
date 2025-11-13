package fr.fms.entities;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee paris = new Employee("Gates", "Bill", 65, "Habitant aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);

		
		System.out.println(paris);

	}

}
