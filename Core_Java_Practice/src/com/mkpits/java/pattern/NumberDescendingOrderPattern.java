/* WAP in java for numeric pattern - Descending Orderwhich is given below-

   5
   5 4
   5 4 3
   5 4 3 2
   5 4 3 2 1

 */

   public class NumberDescendingOrderPattern{

     public static void main(String[] args){

        for(int row=5;row>=1;row--){

        for(int column=5;column>=row;column--){

           System.out.print(column+" ");
           }
             System.out.println();
        }
     }
   }