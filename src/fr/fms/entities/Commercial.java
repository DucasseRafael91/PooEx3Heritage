package fr.fms.entities;

import pooEx1Object.City;
import pooEx1Object.Person;

public class Commercial extends Person {
	
	private String Enterprise;
	private double percentageRevenue; 
	
	public Commercial(String lastName, String firstName, int age, String adress, Capital capitalOfBirth, String enterprise, double percentageRevenue) {
		
		super(lastName, firstName, age, adress, capitalOfBirth);
		
        if (percentageRevenue < 0) {
            throw new RuntimeException("L'age ne peut pas être négatif");
        }
        setEnterprise(enterprise);
		setPercentageRevenue(percentageRevenue);
	}
	
	public Commercial(String lastName, String firstName, int age, String adress, City cityOfBirth, String enterprise, double percentageRevenue) {
		
		super(lastName, firstName, age, adress, cityOfBirth);
		
        if (percentageRevenue < 0) {
            throw new RuntimeException("L'age ne peut pas être négatif");
        }
        setEnterprise(enterprise);
		setPercentageRevenue(percentageRevenue);
	}
	
	public String getEnterprise() {
		return Enterprise;
	}

	public void setEnterprise(String enterprise) {
		Enterprise = enterprise;
	}


	public double getPercentageRevenue() {
		return percentageRevenue;
	}

	public void setPercentageRevenue(double percentageRevenue) {
		this.percentageRevenue = percentageRevenue;
	}
	
	@Override
	public String toString() {
	    return super.toString() + getEnterprise() +
	           ", % CA : " + percentageRevenue;
	}

    @Override
    public double remuneration(double number, double percentage) {
        double salary = (this.getPercentageRevenue()/100) * 50000;
        return salary;
    }
}


