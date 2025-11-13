package fr.fms.entities;

public class CommercialTest {
	
	public static void main(String[] args) {
		Commercial gates = new Commercial("Gates", "Bill", 65, "Habitant aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);

		
		System.out.println(gates);

	}


}
