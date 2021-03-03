// WAP to create a class student having fields rno and name.

class Student{

   int rno;
   String name;
   
}

class TestStudentclass{

     public static void main(String[] args){
     
       Student s1 = new Student();
       s1.rno = 23;
       s1.name = "Swati";
       System.out.println("Roll number =" + s1.rno);
       System.out.println("Name =" + s1.name);
     }
}