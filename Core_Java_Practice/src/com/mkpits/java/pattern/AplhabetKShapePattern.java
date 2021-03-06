/* WAp in java for Alphabet/ Character Patterns - K Shape Character Pattern Program which is given below-

   A B C D E F
   A B C D E
   A B C D
   A B C
   A B
   A
   A
   A B
   A B C
   A B C D
   A B C D E
   A B C D E F

  */

public class AplhabetKShapePattern {

    public static void main(String[] args) {

        for (int row = 5; row >= 0; row--) {

            int alphabet = 65;
            for (int column = 0; column <= row; column++) {

                System.out.print((char) (alphabet + column) + " ");
            }
            System.out.println();
        }

        for (int row = 0; row <= 5; row++) {

            int alphabet = 65;
            for (int column = 0; column <= row; column++) {

                System.out.print((char) (alphabet + column) + " ");
            }

            System.out.println();
        }
    }
}