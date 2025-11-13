package fr.fms.entities;

import pooEx1Object.City;
import pooEx1Object.Person;


public class Employee extends Person {

    private String enterprise;
    private double salary;

    // --- Constructeurs ---


    public Employee(String lastName, String firstName, int age, String address, Capital capitalOfBirth, String enterprise, double salary) {
        super(lastName, firstName, age, address, capitalOfBirth);

        if (salary < 0) {
            throw new RuntimeException("Le salaire ne peut pas être négatif");
        }

        setEnterprise(enterprise);
        setSalary(remuneration(salary, 20));
    }

    public Employee(String lastName, String firstName, int age, String address, City cityOfBirth, String enterprise, double salary) {
        super(lastName, firstName, age, address, cityOfBirth);

        if (salary < 0) {
            throw new RuntimeException("Le salaire ne peut pas être négatif");
        }

        setEnterprise(enterprise);
        setSalary(remuneration(salary, 20));
    }

    // --- Getters et Setters ---
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

    // --- Méthodes ---
    @Override
    public String toString() {
        if (getSalary() == 0) {
            return super.toString() + ", Entreprise : " + getEnterprise();
        }
        return super.toString() + ", Entreprise : " + getEnterprise() + ", Salaire : " + getSalary();
    }

    @Override
    public double remuneration(double number, double percentage) {
        double salary = number - (number * percentage / 100);
        return salary;
    }
}
