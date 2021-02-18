// Pyramid Pattern program

import java.util.*;
class Pyramid{

  public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter number of rows");
	 int n =scan.nextInt();

     for(int i=1;i<=n;i++){

	 for(int j=n-1;j>=i;j--){

    	System.out.print(" ");  // print space
	}

	for(int k=1;k<=i;k++){

	    System.out.print("* "); // print star
       }

	    System.out.println();
     }
   }
 }
