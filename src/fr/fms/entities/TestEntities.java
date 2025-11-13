package fr.fms.entities;

import pooEx1Object.City;

public class TestEntities {
	
    public static void main(String[] args) {

		Employee gates = new Employee("Gates", "Bill", 65, "Habitant aux USA", new Capital("Washington", "USA", 7600000, "W-M"), "Fondation B&M", 100000.0);
		Employee musk = new Employee("Musk", "Elon", 49, "Habitant à palo alto", new City("Pretoria", "Afrique du Sud", 800000), "Tesla", 150000.0);


		Employee[] listOfEmployees = {gates, musk};

        System.out.println("Liste des employees");
        for (Employee employee : listOfEmployees) {
            System.out.println(employee);
        }
        
        System.out.println("Liste des salaires des employees");
        for (Employee employee : listOfEmployees) {
            System.out.println("Salaire de " + employee.getLastName() + " " + employee.getFirstName() + " : " + employee.getSalary());
        }
        
    	Commercial dupont = new Commercial("Dupont", "Robert", 50, "Habitant rue des rosiers à Toulouse", new City("Limoges", "France", 133000), "Brico", 5.0);
    	Commercial dulac = new Commercial("Dulac", "Robac", 50, "Habitant rue des coquelicots à Toulouse", new City("Paris", "France", 133000), "Broci", 10.0);
    	
    	Commercial[] listOfCommercials = {dupont, dulac};


        System.out.println("Liste des commerciaux");
        for (Commercial commercial : listOfCommercials) {
            System.out.println(commercial);
        }
        
        System.out.println("Liste des salaires des commerciaux");
        for (Commercial commercial : listOfCommercials) {
            System.out.println("Salaire de " + commercial.getLastName() + " " + commercial.getFirstName() + " : " + commercial.getRevenuePercentage());
        }

    }

}
