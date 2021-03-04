// WAP to create a class eployee having field empno and empname.

class TestEmployee{

     int empno;
     String empname;
     
  }
  
  class TestEmployeeclass{
  
       public static void main(String[] args){

           TestEmployee s1 = new TestEmployee();
         s1.empno = 23;
         s1.empname = "Swati";
         System.out.println("Employee number =" + s1.empno);
         System.out.println("Employee Name =" + s1.empname);
       }
}