// Reverse Pyramis star pattern

import java.util.*;
class ReversePyramidPattern{

  public static void main(String[] args) {

	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter number of rows");
	 int n =scan.nextInt();

     for(int i=1;i<=n;i++){

	  for(int l=1;l<=i;l++){

		 	 System.out.print(" ") ;
         }

	  for(int j=n;j>=i;j--){

    	System.out.print(" *");
	   }

	    System.out.println();
     }
   }
 }
