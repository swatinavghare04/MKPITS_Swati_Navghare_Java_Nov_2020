// Java throw keyword example.

public class TestThrowKeyword{

   static void validate(int age){

     if(age>18)
     throw new ArithmeticException("not valid");
     else
     System.out.println("Welcome to vote");
   }

   public static void main(String[] args){

     try{

        validate(13);
     }
     catch(ArithmeticException e){

       System.out.println(e.toString());
     }

     System.out.println("rest of the code...");
   }
}