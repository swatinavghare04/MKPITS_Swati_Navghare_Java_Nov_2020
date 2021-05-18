// WAP to perform division of two matrices.

package src.com.mkpits.java.practiceprogram;

public class DivisionOfMatrix {
    public static void main(String args[]){

        //creating two matrices
        int m1[][]={{3,5,4},{7,4,5},{6,7,8}};
        int m2[][]={{1,1,2},{1,2,1},{2,1,4}};


        // creating another matrix to store the sum of two matrices
        int c[][]=new int[3][3];

        //substracting and printing substraction of 2 matrices

        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                c[row][col]=m1[row][col] / m2[row][col];
                System.out.print(c[row][col]+" ");
            }
            System.out.println();//new line
        }

    }
}
