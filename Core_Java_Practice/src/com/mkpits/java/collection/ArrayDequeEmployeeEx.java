// WAP to demonstrate ArrayDeque example where we are adding employee to list and printing all the employee information.

package src.com.mkpits.java.collection;
import  java.util.*;

class Employee {
    int empid;
    String empname,designation,email ;
    int salary;

    public Employee(int empid, String empname, String designation, String email, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.designation = designation;
        this.email = email;
        this.salary = salary;
    }
}

public class ArrayDequeEmployeeEx {
    public static void main(String[] args) {
        Deque<Employee> set = new ArrayDeque<Employee>();
        //Creating Books
        Employee e1 = new Employee(101, "Swati", "Developer", "abc@gmail.com", 25000);
        Employee e2 = new Employee(102, "Swapnil", "Tester", "xyz@gmail.com", 30000);
        Employee e3 = new Employee(103, "Dhiru", "Junior Developer", "wer@gmail.com", 20000);
        //Adding Books to Deque
        set.add(e1);
        set.add(e2);
        set.add(e3);
        //Traversing ArrayDeque
        for (Employee emp : set) {
            System.out.println(emp.empid + " " + emp.empname + " " + emp.designation + " " + emp.email + " " + emp.salary);
        }
    }
}
