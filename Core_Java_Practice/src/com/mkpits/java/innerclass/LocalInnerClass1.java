// WAP for local inner class.

public class LocalInnerClass1{

  private int data = 30;

  void display(){

    class Local{

       void msg(){

          System.out.println(data);
       }
    }

       Local a =new Local();
       a.msg();
    }

    public static void main(String[] args){

       LocalInnerClass1 obj = new LocalInnerClass1();
       obj.display();
    }
  }
