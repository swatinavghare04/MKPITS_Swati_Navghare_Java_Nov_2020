/* WAP in java to print number pattern given below :
1
12
123
1234
12345
123456
1234567
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

class NumberPatternEx02{
    public static void main(String[] args){

        // Printing upper part
        for(int row=1;row<=8;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }

        //Printing lower part
        for(int row=7;row>=1;row--){
            for(int col=1;col<=row;col++){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
