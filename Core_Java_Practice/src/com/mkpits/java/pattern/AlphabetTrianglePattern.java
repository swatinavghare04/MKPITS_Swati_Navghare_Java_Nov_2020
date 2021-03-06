/* WAp in java for Alphabet/ Character Patterns - Triangle Character Pattern which is given below

        A
       A B
      A B C
     A B C D
    A B C D E
   A B C D E F

 */

   public class AlphabetTrianglePattern{

      public static void main(String[] args){

        for (int row = 0; row <= 5; row++) {

          int alphabet = 65;

        for (int column = 5; column > row; column--){

            System.out.print(" ");
          }

        for (int column1 = 0; column1 <= row; column1++){

            System.out.print((char) (alphabet + column1) + " ");
        }

            System.out.println();
         }
      }
   }