// WAP in java to illustrate Multilevel inheritance.

import java.util.*;

class TestPerson {
    String name;

    void getpersondata(String name) {
        this.name = name;
    }

    void showpersondata() {
        System.out.println("name = " + name);
    }
}

class Employee extends TestPerson {
    float salary;

    void getemployeedata(String name, float salary) {
        getpersondata(name);
        this.salary = salary;
    }

    void showemployeedata() {
        showpersondata();
        System.out.println("Salary = " + salary);
    }
}

class TestParttimeemployee extends Employee {
    int workinghours;  // instance variable

    void getparttimeemployeedata(String name, float salary, int workinghours)// local variable
    {
        getemployeedata(name, salary);
        this.workinghours = workinghours;
    }

    void showparttimeemployeedata() {
        showemployeedata();
        System.out.println("Workinghours = " + workinghours);
    }
}

class TestMultiLevelInheritance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TestParttimeemployee emp = new TestParttimeemployee();
        System.out.println("enter name");
        String ename = sc.next();
        System.out.println("enter salary");
        float sal = sc.nextFloat();
        System.out.println("enter workinghours");
        int Whours = sc.nextInt();
        emp.getparttimeemployeedata(ename, sal, Whours);
        emp.showparttimeemployeedata();
    }
}
