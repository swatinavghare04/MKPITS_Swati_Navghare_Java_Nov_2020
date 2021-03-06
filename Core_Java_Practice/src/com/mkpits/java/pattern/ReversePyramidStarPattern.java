/* WAP in java for Reverse Pyramid star pattern which is shown below-

 * * * * *
 * * * *
 * * *
 * *
 *
 */


import java.util.*;

class ReversePyramidStarPattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = scan.nextInt();

        for (int row = 1; row <= n; row++) {

            for (int column = 1; column <= row; column++) {

                System.out.print(" ");
            }

            for (int column = n; column >= row; column--) {

                System.out.print(" *");
            }

            System.out.println();
        }
    }
}
