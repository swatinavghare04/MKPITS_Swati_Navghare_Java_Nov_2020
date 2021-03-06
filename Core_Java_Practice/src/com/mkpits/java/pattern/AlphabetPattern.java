/* WAP in java for Alphabet/ Character Patterns program which is given below-

A
B B
C C C
D D D D
E E E E E
F F F F F F

*/

public class AlphabetPattern{

  public static void main(String[] args){

    int alphabet = 65;
       for (int row = 0; row<= 5; row++){

         for (int column = 0; column <= row; column++){

              System.out.print((char) alphabet + " ");
            }

            alphabet++;
            System.out.println();
         }
     }
}