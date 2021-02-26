// WAP of nested interface which is declared within the class - example 2

class Student{

   interface instudent{

    void msg();
   }

   interface instudent1{

       void msg1();
   }
}

 class TestNestedInterface3 implements Student.instudent,Student.instudent1{

    public void msg(){

       System.out.println("Hello from message");
    }

    public void msg1(){

	       System.out.println("Hello from message2");
    }

    public static void main(String[] args){

      Student.instudent s1 = new TestNestedInterface3();
      s1.msg();

      Student.instudent1 s2 = new TestNestedInterface3();
      s2.msg1();
    }
 }