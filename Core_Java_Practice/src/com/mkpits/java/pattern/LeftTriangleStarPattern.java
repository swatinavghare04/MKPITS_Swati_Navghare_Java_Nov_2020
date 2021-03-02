/* WAP to print the left triangle star pattern which is given below-

         *
       * *
     * * *
   * * * *
 * * * * *

 */

class LeftTriangleStarPattern{

 public static void main(String[] args){

  int i,j;

  for(i=1;i<=5;i++){

   for(j=4;j>=i;j--){

    System.out.print(" ");
   }

   for(int k=1;k<=i;k++){

     System.out.print("*");
     }

     System.out.println();
  }
 }
}