package fr.fms.entities;

import pooEx1Object.Person;

public class Employee extends Person {
	

	private String enterprise;
	private double salary;
	
	public Employee(String lastName, String firstName, int age, String adress, Capital CityOfBirth, String enterprise, double salary) {
		super(lastName, firstName, age, adress, CityOfBirth);
		setEnterprise(enterprise);
		setSalary(salary);
	}
	
    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
	    return  getLastName() +
	            ", " + getFirstName() +
	            ", " + getAge() +
	            "ans, " + getAdress() +
	            ", Ville de naissance : " + getCityOfBirth() +
	            ", Entreprise : " + getEnterprise() +
	            ", Salaire : " + getSalary() ;
	}


}
