package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    final private String peselId;
    final private String firstName;
    final private String lastName;
    final private BigDecimal baseSalaru;

    public Employee(String peselId, String firstName, String lastName, BigDecimal baseSalaru) {
        this.peselId = peselId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalaru = baseSalaru;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getBaseSalaru() {
        return baseSalaru;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return getPeselId() != null ? getPeselId().equals(employee.getPeselId()) : employee.getPeselId() == null;
    }

    @Override
    public int hashCode() {
        return getPeselId() != null ? getPeselId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalaru=" + baseSalaru +
                '}';
    }
}
