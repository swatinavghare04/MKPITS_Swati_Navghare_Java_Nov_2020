/* WAP in java to print number pattern given below :
123456789
12345678
1234567
123456
12345
1234
123
12
1

 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx04{
    public static void main(String[] args){

        for(int row=9;row>=1;row--){

            for(int col=1;col<=row;col++){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
