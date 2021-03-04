// WAP in java to enter employee data and use of parameterised constructor.

import java.util.*;
class Testemployee3
{
 int eid;
 String ename,sex;
 float salary;
 String shift,e_addr,e_mob;

public Testemployee3(int emid,String en,String sx,float sa,String sft,String eaddr,String emob)
{
  eid = emid;
  ename = en;
  sex = sx;
  salary = sa;
  shift = sft;
  e_addr = eaddr;
  e_mob = emob;
 }

void showemp()
{
 System.out.println("--------------employee details---------");
 System.out.println("eid ="+ eid);
 System.out.println("ename ="+ ename);
 System.out.println("sex ="+ sex);
 System.out.println("salary ="+ salary);
 System.out.println("shift ="+ shift);
 System.out.println("e_addr ="+ e_addr);
 System.out.println("e_mob ="+ e_mob);
 System.out.println("---------------------------------------");
}
}

class UseofParameterisedConstructor
{
  public static void main(String[] args)
  {
     Scanner sct = new Scanner(System.in);

     System.out.println("enter employee id");
     int empid = sct.nextInt();
     System.out.println("enter employee name");
     String empname = sct.next();
     System.out.println("enter employee sex");
     String empsex = sct.next();
     System.out.println("enter employee salary");
     float empsal = sct.nextFloat();
     System.out.println("enter employee shift");
     String empshift = sct.next();
     System.out.println("enter employee address");
     String emp_addr = sct.next();
     System.out.println("enter employee mobile");
     String emp_mob = sct.next();

      Testemployee3 emp = new Testemployee3(empid,empname,empsex,empsal,empshift,emp_addr,emp_mob);
     emp.showemp();
    }
  }



