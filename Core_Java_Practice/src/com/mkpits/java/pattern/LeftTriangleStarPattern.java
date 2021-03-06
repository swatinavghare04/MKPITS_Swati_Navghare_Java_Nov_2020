/* WAP to print the left triangle star pattern which is given below-

 *
 * *
 * * *
 * * * *
 * * * * *

 */

class LeftTriangleStarPattern {

    public static void main(String[] args) {

        int row, column;

        for (row = 1; row <= 5; row++) {

            for (column = 4; column >= row; column--) {

                System.out.print(" ");
            }

            for (column = 1; column <= row; column++) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}