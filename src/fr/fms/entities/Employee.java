package fr.fms.entities;

import pooEx1Object.City;
import pooEx1Object.Person;

public class Employee extends Person {
	

	private String enterprise;
	private double salary;
	
	public Employee(String lastName, String firstName, int age, String adress, Capital CapitalOfBirth, String enterprise) {
		super(lastName, firstName, age, adress, CapitalOfBirth);
		setEnterprise(enterprise);
		setSalary(salary);
	}
	
	public Employee(String lastName, String firstName, int age, String adress, City CityOfBirth, String enterprise) {
		super(lastName, firstName, age, adress, CityOfBirth);
		setEnterprise(enterprise);
		setSalary(salary);
	}
	
	public Employee(String lastName, String firstName, int age, String adress, Capital CapitalOfBirth, String enterprise, double salary) {
		super(lastName, firstName, age, adress, CapitalOfBirth);
		setEnterprise(enterprise);
		setSalary(salary);
	}
	
	public Employee(String lastName, String firstName, int age, String adress, City CityOfBirth, String enterprise, double salary) {
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
		if (getSalary() == 0 ) {
			 return  super.toString() + ", Entreprise : " + getEnterprise();
			
		}
	    return  super.toString() +
	            ", Entreprise : " + getEnterprise() +
	            ", Salaire : " + getSalary() ;
	}


}
