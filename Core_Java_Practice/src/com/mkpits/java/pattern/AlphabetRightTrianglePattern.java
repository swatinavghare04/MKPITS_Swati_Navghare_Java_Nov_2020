/* WAp in java for Alphabet/ Character Patterns -  Right Alphabetic triangle which is given below-

   A
   A B
   A B C
   A B C D
   A B C D E
   A B C D E F

 */

   public class AlphabetRightTrianglePattern{

     public static void main(String[] args){

           int alphabet = 65;
        for (int row = 0; row <= 5; row++){

         for (int column = 0; column <= row; column++){

           System.out.print((char) (alphabet + column) + " ");

            }

            System.out.println();
        }
     }
   }