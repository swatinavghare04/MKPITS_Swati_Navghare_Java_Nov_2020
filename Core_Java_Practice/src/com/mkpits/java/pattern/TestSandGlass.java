/* WAP in java to create Sandglass star pattern which is given below-

* * * * *
 * * * *
  * * *
   * *
    *
    *
   * *
  * * *
 * * * *
* * * * *

*/

class TestSandGlass{

 public static void main(String[] args){

   for(int i=1;i<=5;i++){

   for(int j=1;j<=i;j++){

    System.out.print(" ");
   }

   for(int k=5;k>=i;k--){

   System.out.print("* ");
   }

   System.out.println();
   }

   for(int i=1;i<=5;i++){

	 for(int l=5;l>=i;l--){

		 System.out.print(" ");
	 }

	 for(int p=1;p<=i;p++){

		 System.out.print("* ");
	 }

	 System.out.println();
  }
 }
}