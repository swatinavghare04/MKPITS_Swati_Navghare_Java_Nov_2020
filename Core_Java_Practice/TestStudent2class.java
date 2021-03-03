// WAP in java to create a class student having fields rno and name and getdata method with 2 parameters and showdata method.

class Student2{

  int rno;
  String name;

  void getdata(int rollno, String Name){

      rno = rollno;
      name = Name;
  }

  void showdata(){

     System.out.println("Student roll number =" + rno);
     System.out.println("Student name =" + name);

  }
}

class TestStudent2class{

   public static void main(String[] args){

     Student2 s2 = new Student2();
     s2.getdata(23,"Sonu");
     s2.showdata();
   }
}