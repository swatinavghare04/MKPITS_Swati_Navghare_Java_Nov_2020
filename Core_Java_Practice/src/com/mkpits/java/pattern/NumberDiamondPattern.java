/* WAP in java for numeric pattern -  Diamond Numeric Pattern which is given below-

   1 2 3 4 5
    2 3 4 5
     3 4 5
      4 5
       5
      4 5
     3 4 5
    2 3 4 5
   1 2 3 4 5

 */

public class NumberDiamondPattern {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column < row; column++) {
                System.out.print(" ");
            }
            for (int column = row; column <= 5; column++) {

                System.out.print(column + " ");
            }
            System.out.println();
        }
        for (int row = 4; row >= 1; row--) {

            for (int column = 1; column < row; column++) {

                System.out.print(" ");
            }

            for (int column = row; column <= 5; column++) {

                System.out.print(column + " ");
            }

            System.out.println();
        }
    }
}