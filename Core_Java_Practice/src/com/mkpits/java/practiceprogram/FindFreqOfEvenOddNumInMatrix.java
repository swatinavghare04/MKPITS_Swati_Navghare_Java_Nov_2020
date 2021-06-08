//WAP to demonstrate how to find the frequency of even and odd numbers in matrix.

package src.com.mkpits.java.practiceprogram;

public class FindFreqOfEvenOddNumInMatrix {
    public static void main(String[] args){
        int m1[][] = {{4,1,3},{3,5,7},{8,2,6}};
        int countEven = 0;
        int countOdd = 0;

        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(m1[row][col]%2==0)
                    countEven++;
                else
                    countOdd++;
            }
        }
        System.out.println("Frequency of even numbers :"+countEven);
        System.out.println("Frequency of odd numbers :"+countOdd);
    }
}
