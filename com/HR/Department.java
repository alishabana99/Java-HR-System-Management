package com.HR;

public class Department {

    //requirement: max # of employees in the department is 10
    private static final int MAX_EMPLOYEES = 10;
    /*- Data -*/
    private String name;
    private int employees_count;
    private Employee[] employees;
    private double total_salaries;

    /*- Methods -*/
    public Department(String n) {
        this.name = n;
        employees = new Employee[MAX_EMPLOYEES];
        employees_count = 0;
        total_salaries = 0.0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //takes the only initialized array slots
    //requirement: getEmployees should not return nulls, but return an Empty object (in case of an empty department)
    public Employee[] getEmployees() {
        if (employees_count == 0) {
            Employee empty_emp = new Employee(0, "", 0.0);
            Employee[] empty = {empty_emp};
            return empty;
        }
        //creating a new array with the actual size of our employees count
        Employee[] all_employees = new Employee[employees_count - 1];
        int i;
        for (i = 0; i < employees_count - 1; i++) {
            //loading the new array with employees
            all_employees[i] = employees[i];
        }
        return all_employees;
    }

    public int getEmployeesCount() {
        return employees_count;
    }

    //adding employees to the department
    //requirement: Department capacity should not exceed 10 employees
    public boolean addEmployee(Employee e) {
        //checking if it's full
        if (employees_count >= MAX_EMPLOYEES) {
            return false;
        } else {
            //there still be empty slots, adding new employee
            employees[employees_count++] = new Employee(e);
            //adding his salary to the Total department salaries
            //In order to be ready whenever needed, avoiding looping each time it's requested
            total_salaries += e.getSalary();
            return true;
        }
    }

    public Employee getEmployeeByID(int id) {
        //doing a naive linear search
        for (Employee e :
                getEmployees()) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public double getTotalSalaries() {
        return total_salaries;
    }

    public double getAVGSalaries() {
        //Checking if no employess
        //avoiding division by 0
        if (employees_count == 0)
            return 0;
        else
            return total_salaries / employees_count;
    }

    @Override
    public String toString() {
        String department_str = this.name + "\n";
        for (Employee e : getEmployees()) {
            department_str += e.toString() + "\n";
        }
        return department_str;
    }

}
