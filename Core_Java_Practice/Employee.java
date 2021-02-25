// Example to create Immutable class.

public final class Employee{

  public static void main(String[] args){
   final String pancardNumber;

   public Employee(String pancardNumber){

     this.pancardNumber = pancardNumber;
   }

   public String getPancardNumber(){

      return pancardNumber;
    }
  }
}