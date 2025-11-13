package fr.fms.entities;
import pooEx1Object.City;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee gates = new Employee("Gates", "Bill", 85, "Habitant aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "Habitant à palo alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);

		
		System.out.println(gates);
		System.out.println(musk);

	}

}
