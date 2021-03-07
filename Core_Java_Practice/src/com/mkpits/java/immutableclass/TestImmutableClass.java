// WAP in java to create Immutable class.

final class ImmutableEmployee{

   final String PancardNumber;

   public ImmutableEmployee(String pancardNumber){

     this.PancardNumber = pancardNumber;
   }

   public String getPancardNumber(){

      return PancardNumber;
    }
  }

   public class TestImmutableClass{
     public static void main(String[] args){

          ImmutableEmployee e = new ImmutableEmployee("abc123");
          System.out.println("pancard no" + e.getPancardNumber());

      }
  }