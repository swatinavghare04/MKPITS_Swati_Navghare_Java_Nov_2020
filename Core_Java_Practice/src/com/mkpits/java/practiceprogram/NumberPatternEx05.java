/* WAP in java to print number pattern given below :
7654321
654321
54321
4321
321
21
1
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx05{
    public static void main(String[] args){

        for(int row=7;row>=1;row--){

            for(int col=row;col>=1;col--){

                System.out.print(col);
            }
            System.out.println();
        }
    }
}
