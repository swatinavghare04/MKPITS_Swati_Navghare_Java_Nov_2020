/* WAP in java to print below number pattern-
7 7 7 7 7 7 7 7 7 7 7 7 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 2 1 2 3 4 5 6 7
7 6 5 4 3 2 2 2 3 4 5 6 7
7 6 5 4 3 3 3 3 3 4 5 6 7
7 6 5 4 4 4 4 4 4 4 5 6 7
7 6 5 5 5 5 5 5 5 5 5 6 7
7 6 6 6 6 6 6 6 6 6 6 6 7
7 7 7 7 7 7 7 7 7 7 7 7 7
 */

package src.com.mkpits.java.practiceprogram;

class NumberPatternEx12{
    public static void main(String[] args){

        int row,col,min,n=7;

        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){

                min = row<col ? row:col;
                System.out.print(n-min+1+" ");
            }
            for(col=n-1;col>=1;col--){

                min = row<col ? row:col;
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
        for(row=n-1;row>=1;row--){
            for(col=1;col<=n;col++){

                min = row<col ? row:col;
                System.out.print(n-min+1+" ");
            }
            for(col=n-1;col>=1;col--){

                min = row<col ? row:col;
                System.out.print(n-min+1+" ");
            }
            System.out.println();
        }
    }
}
