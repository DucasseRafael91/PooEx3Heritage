package fr.fms.entities;

import pooEx1Object.City;

public class Commercial extends Employee {
	
	private double percentageRevenue; 
	
	public Commercial(String lastName, String firstName, int age, String adress, Capital capitalOfBirth, String enterprise, double percentageRevenue) {
		
		super(lastName, firstName, age, adress, capitalOfBirth, enterprise);
		
        if (percentageRevenue < 0) {
            throw new RuntimeException("L'age ne peut pas être négatif");
        }
        
		setPercentageRevenue(percentageRevenue);
	}
	
	public Commercial(String lastName, String firstName, int age, String adress, City cityOfBirth, String enterprise, double percentageRevenue) {
		
		super(lastName, firstName, age, adress, cityOfBirth, enterprise);
		
        if (percentageRevenue < 0) {
            throw new RuntimeException("L'age ne peut pas être négatif");
        }
        
		setPercentageRevenue(percentageRevenue);
	}

	public double getPercentageRevenue() {
		return percentageRevenue;
	}

	public void setPercentageRevenue(double percentageRevenue) {
		this.percentageRevenue = percentageRevenue;
	}
	
	@Override
	public String toString() {
	    return super.toString() + 
	           ", % CA : " + percentageRevenue;
	}
}
