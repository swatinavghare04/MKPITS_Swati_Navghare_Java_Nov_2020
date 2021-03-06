/* WAP in java to illustrate Pyramid Pattern program which is given below-
     *
    * *
   * * *
  * * * *
 * * * * *
 */

import java.util.*;
class PyramidStarPattern {

  public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter number of rows");
	 int n =scan.nextInt();

     for(int row=1;row<=n;row++){

	 for(int column=n-1;column>=row;column--){

    	System.out.print(" ");  // print space
	}

	for(int column=1;column<=row;column++){

	    System.out.print("* "); // print star
       }

	    System.out.println();
     }
   }
 }
