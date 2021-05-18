// WAP to find the transpose of a given matrix.

package src.com.mkpits.java.practiceprogram;

public class TransposeOfMatrix {
    public static void main(String args[]) {

        //creating two matrices
        int m1[][] = {{3, 5, 4}, {7, 4, 5}, {6, 7, 8}};

        int c[][] = new int[3][3];

        // Original matrix
        System.out.println("Original Matrix :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                c[row][col] = m1[row][col];
                System.out.print(c[row][col] + " ");
            }
            System.out.println();//new line
        }

        // Transpose of a given Matrix
        System.out.println("Transpose of a Matrix :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                c[row][col] = m1[col][row];
                System.out.print(c[row][col] + " ");
            }
            System.out.println();//new line
        }

    }
}
