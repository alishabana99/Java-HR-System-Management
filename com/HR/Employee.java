package com.HR;


public class Employee {


    /*- Data -*/
    private int id;
    private String name;
    private double salary;


    /*- Methods -*/
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee original_employee){
        this.id = original_employee.id;
        this.name = original_employee.name;
        this.salary = original_employee.salary;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return this.id+": "+this.name+" [" +this.salary+" LE]";
    }
}
