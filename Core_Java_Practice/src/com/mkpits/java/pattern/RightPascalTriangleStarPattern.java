/* WAP in java for Right Pascals Triangle which is shown below-

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */


class RightPascalTriangleStarPattern {

    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print("*");
            }
            System.out.println();
        }

        for (int row = 1; row <= 4; row++) {

            for (int column = 4; column >= row; column--) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}