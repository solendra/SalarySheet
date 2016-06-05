/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.salarysheet.entity;

/**
 *
 * @author solendra
 */
public class Salary {
    private int id;
    private String firstName,lastName,email,contact;
    private double salary;
    private boolean salaryStatus;

    public Salary() {
    }

    public Salary(int id, String firstName, String lastName, String email, String contact, double salary, boolean salaryStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.salaryStatus = salaryStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isSalaryStatus() {
        return salaryStatus;
    }

    public void setSalaryStatus(boolean salaryStatus) {
        this.salaryStatus = salaryStatus;
    }

    @Override
    public String toString() {
        return "Salary{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", contact=" + contact + ", salary=" + salary + ", salaryStatus=" + salaryStatus + '}';
    }
    
}
