package fr.fms.entities;

public class Commercial extends Employee {
	
	private double percentageRevenue;

	public Commercial(String lastName, String firstName, int age, String adress, Capital CapitalOfBirth,String enterprise, double percentageRevenue) {
		
		super(lastName, firstName, age, adress, CapitalOfBirth, enterprise);
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
	    return  super.toString() +
	            ", Entreprise : " + getEnterprise() +
	            ", Salaire : " + getSalary() ;
	}

}
