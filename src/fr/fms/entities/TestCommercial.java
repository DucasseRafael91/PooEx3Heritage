package fr.fms.entities;
import pooEx1Object.City;

public class TestCommercial {
	
	public static void main(String[] args) {
		Commercial gates = new Commercial("Dupont", "Robert", 50, "Habitant rue des rosiers à Toulouse", new City("Limoges", "France", 133000), "Brico", 5.0);

		
		System.out.println(gates);

	}


}
