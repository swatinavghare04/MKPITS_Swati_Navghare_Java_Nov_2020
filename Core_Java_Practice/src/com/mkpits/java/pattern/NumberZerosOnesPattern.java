/* WAP in java for numeric pattern - Zeros/ ones Pattern Programs which is given below-

   1
   10
   101
   1010
   10101   */

   public class NumberZerosOnesPattern{

      public static void main(String[] args){

       for (int i = 1; i <= 5; i++)
               {
                   for (int j = 1; j <= i; j++)
                   {
                       if(j%2 == 0)
                       {
                           System.out.print(0);
                       }
                       else
                       {
                           System.out.print(1);
                       }
                   }

                   System.out.println();
        }
      }
   }