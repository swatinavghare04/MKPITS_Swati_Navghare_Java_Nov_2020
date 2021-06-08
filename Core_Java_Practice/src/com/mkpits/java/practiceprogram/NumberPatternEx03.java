/* WAP in java to print number pattern given below :
987654321
98765432
9876543
987654
98765
9876
987
98
9
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx03 {
    public static void main(String[] args) {

        for (int row = 1; row <= 9; row++) {

            for (int col = 9; col >= row; col--) {

                System.out.print(col);
            }
            System.out.println();
        }
    }
}