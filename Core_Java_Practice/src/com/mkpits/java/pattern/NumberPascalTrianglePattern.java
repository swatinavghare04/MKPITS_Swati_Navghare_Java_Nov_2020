/* WAP in java for pascal triangle pattern which is given below-

             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1

 */


public class NumberPascalTrianglePattern {

    public static void main(String[] args) {

        int n = 5;
        for (int row = 0; row < n; row++) {
            int number = 1;
            System.out.printf("%" + (n - row) * 2 + "s", "");
            for (int column = 0; column <= row; column++) {
                System.out.printf("%4d", number);
                number = number * (row - column) / (column + 1);
            }

            System.out.println();
        }
    }
}