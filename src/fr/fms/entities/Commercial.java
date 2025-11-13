package fr.fms.entities;

import pooEx1Object.City;
import pooEx1Object.Person;

public class Commercial extends Person {

    private String company;
    private double revenuePercentage;

    public Commercial(String lastName, String firstName, int age, String address, Capital capitalOfBirth, String company, double revenuePercentage) {
        super(lastName, firstName, age, address, capitalOfBirth);

        if (revenuePercentage < 0) {
            throw new RuntimeException("The percentage cannot be negative");
        }
        setCompany(company);
        // on stocke ici le salaire calculé à partir du pourcentage du CA (50000)
        setRevenuePercentage(remuneration(revenuePercentage, 0));
    }

    public Commercial(String lastName, String firstName, int age, String address, City cityOfBirth, String company, double revenuePercentage) {
        super(lastName, firstName, age, address, cityOfBirth);

        if (revenuePercentage < 0) {
            throw new RuntimeException("The percentage cannot be negative");
        }
        setCompany(company);
        // idem ici : calcul à la création
        setRevenuePercentage(remuneration(revenuePercentage, 0));
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getRevenuePercentage() {
        return revenuePercentage;
    }

    public void setRevenuePercentage(double revenuePercentage) {
        this.revenuePercentage = revenuePercentage;
    }

    @Override
    public String toString() {
        return super.toString() + company + ", Revenue (€): " + revenuePercentage;
    }

    @Override
    public double remuneration(double percentage, double unused) {
        // chiffre d’affaires moyen fictif : 50 000 €
        double averageTurnover = 50000;
        // calcul du salaire à partir du pourcentage du CA
        return (percentage / 100) * averageTurnover;
    }
}
