/* WAP in java to print below number pattern-
1
2 10
3 11 18
4 12 19 25
5 13 20 26 31
6 14 21 27 32 36
7 15 22 28 33 37 40
8 16 23 29 34 38 41 43
9 17 24 30 35 39 42 44 45
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx10{
    public static void main(String[] args){

        int row ,col;
        for(row=1;row<=9;row++){

            int k=row;

            for(col=1;col<=row;col++){

                System.out.print(k+" ");
                k = k+9-col;
            }
            System.out.println();
        }
    }
}
