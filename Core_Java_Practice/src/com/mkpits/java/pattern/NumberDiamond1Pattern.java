/* WAP in java for numeric pattern - Diamond Pattern which is given below-

   1
  212
 32123
4321234
 32123
  212
   1

 */

   public class NumberDiamond1Pattern
   {
       public static void main(String[] args) {
           for (int row = 1; row <= 4; row++)
           {
               int n = 4;

               for (int column = 1; column<= n - row; column++) { System.out.print(" "); } for (int column = row; column >= 1; column--)
               {
                   System.out.print(column);
               }
               for (int column = 2; column <= row; column++) { System.out.print(column); } System.out.println(); } for (int row = 3; row >= 1; row--)
           {
               int n = 3;

               for (int column = 0; column<= n - row; column++) { System.out.print(" "); } for (int column = row; column >= 1; column--)
               {
                   System.out.print(column);
               }
               for (int column = 2; column <= row; column++)
               {
                   System.out.print(column);
               }

               System.out.println();
           }

       }
}