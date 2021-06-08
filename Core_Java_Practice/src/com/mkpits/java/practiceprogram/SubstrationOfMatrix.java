//Java Program to demonstrate the substraction of two matrices in Java.

package src.com.mkpits.java.practiceprogram;

class SubstractionOfMatrix{

    public static void main(String args[]){

        //creating two matrices
        int m1[][]={{3,5,4},{7,4,5},{6,7,8}};
        int m2[][]={{1,2,4},{4,1,3},{2,5,3}};


        // creating another matrix to store the sum of two matrices
        int c[][]=new int[3][3];

        //substracting and printing substraction of 2 matrices

        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                c[row][col]=m1[row][col] - m2[row][col];
                System.out.print(c[row][col]+" ");
            }
            System.out.println();//new line
        }

    }
}