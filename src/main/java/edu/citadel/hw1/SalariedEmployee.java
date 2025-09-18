package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public double getMonthlyPay() {
        return annualSalary / 12;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" +
                "name=" + getName() +
                ", hireDate=" + getHireDate() +
                ", " +
                "annualSalary=" + annualSalary +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(annualSalary, that.annualSalary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(annualSalary);
    }
}
