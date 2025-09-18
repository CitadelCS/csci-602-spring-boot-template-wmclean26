package edu.citadel.hw1;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public abstract double getMonthlyPay();

    public int compareTo(Employee other) {
        return Double.compare(this.getMonthlyPay(), other.getMonthlyPay());
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

}
