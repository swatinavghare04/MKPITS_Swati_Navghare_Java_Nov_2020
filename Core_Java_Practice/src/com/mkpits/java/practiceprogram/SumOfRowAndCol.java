// WAP to find the sum of each row and each column of a matrix

package src.com.mkpits.java.practiceprogram;

public class SumOfRowAndCol {
    public static void main(String[] args){
        int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int RowSum, ColSum;

        // calculate sum of each row in matrix

        for(int row=0;row<3;row++){
            RowSum = 0;
            for(int col =0;col<3;col++){
                RowSum = RowSum + m1[row][col];
            }
            System.out.println("Sum of "+(row+1)+" row " + RowSum);
        }

        // calculate sum of each col in matrix

        for(int row=0;row<3;row++){
            ColSum = 0;
            for(int col =0;col<3;col++){
                ColSum = ColSum + m1[row][col];
            }
            System.out.println("Sum of "+(row+1)+" column " + ColSum);
        }
    }
}
