// Example to create Immutable class.

public final class TestImmutableClass{

  public static void main(String[] args){
   final String pancardNumber;

   public TestImmutableClass(String pancardNumber){

     this.pancardNumber = pancardNumber;
   }

   public String getPancardNumber(){

      return pancardNumber;
    }
  }
}