import com.HR.Department;
import com.HR.Employee;

import java.util.Scanner;

public class HRApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee(1,"Mesho",3333.9);
        Employee e2 = new Employee(4,"Nader",11111.33);
        Employee e3 = new Employee(5,"De3bs",12345.33);
        Employee e4 = new Employee(12,"Kamal",31341.34);
        Employee e5 = new Employee(33,"Dalal",121331.1);
        Department d = new Department("My Department");


        /*Adding employees to my department*/
        if(!d.addEmployee(e1)){System.out.println("Department is full");}
        if(!d.addEmployee(e2)){System.out.println("Department is full");}
        if(!d.addEmployee(e3)){System.out.println("Department is full");}
        if(!d.addEmployee(e4)){System.out.println("Department is full");}
        if(!d.addEmployee(e5)){System.out.println("Department is full");}
        System.out.println("Department Employees Data:");
        System.out.println(d);

        System.out.println("------------------");

        /*Searching By ID*/
        System.out.println("Enter the ID of the employee you're searching for: ");
        Employee search_e = d.getEmployeeByID(scanner.nextInt());
        if(search_e != null){
            System.out.println("Found: "+search_e);
        }else{
            System.out.println("Not Found");
        }

        System.out.println("------------------");

        /*Total Salary of the department*/
        System.out.println("Total Salary of the department");
        System.out.println(d.getTotalSalaries());
        System.out.println("------------------");

        /*AVG Salary of the department*/
        System.out.println("AVG Salary of the department");
        System.out.println(d.getAVGSalaries());
    }
}
