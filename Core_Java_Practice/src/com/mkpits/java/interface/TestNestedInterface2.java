// WAP of nested interface which is declared within the class.

class TestA{

   interface Message{

    void msg();
   }
}

 class TestNestedInterface2 implements TestA.Message{

    public void msg(){

       System.out.println("Hello nested interface");
    }

    public static void main(String[] args){

      TestA.Message message = new TestNestedInterface2();
      message.msg();
    }
 }