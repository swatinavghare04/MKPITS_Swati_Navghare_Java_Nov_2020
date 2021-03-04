// WAP for local inner class with local variable.

public class LocalInnerClass2{

  private int data = 30;

  void display(){

          int value = 50;

    class Local{

       void msg(){

          System.out.println(value);
       }
    }

       Local a =new Local();
       a.msg();
    }

    public static void main(String[] args){

       LocalInnerClass2 obj = new LocalInnerClass2();
       obj.display();
    }
  }
