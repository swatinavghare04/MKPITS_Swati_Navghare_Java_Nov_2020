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
12
123
1234
12345
123456
1234567
12345678
123456789
 */

package src.com.mkpits.java.practiceprogram;

class NumberPaternEx07{
    public static void main(String[] args){

        int row,col;
        for(row=9;row>=1;row--){
            for(col=1;col<=row;col++){

                System.out.print(col);
            }
            System.out.println();
        }
        for(row=2;row<=9;row++){
            for(col=1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}