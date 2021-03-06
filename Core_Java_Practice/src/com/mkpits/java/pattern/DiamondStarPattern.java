/* WAP in java for diamond star pattern which is given below-

 *
 ***
 *****
 *******
 *********
 *******
 *****
 ***
 *

 */

import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String args[]) {
        int n, row, column, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for (column = 1; column <= n; column++) {
            for (row = 1; row <= space; row++) {
                System.out.print(" ");
            }
            space--;
            for (row = 1; row <= 2 * column - 1; row++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (column = 1; column <= n - 1; column++) {
            for (row = 1; row <= space; row++) {
                System.out.print(" ");
            }
            space++;
            for (row = 1; row <= 2 * (n - column) - 1; row++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}