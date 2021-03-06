/* WAP in java for alphabate A pattern which is given below-

**
* *
***
* *
* *
* *

*/

import java.util.*;

public class AlphaAPattern{

  void display(int n){
	for(int row=0;row<=n;row++){

		for(int column=0;column<=n/2;column++){

			if((column==0||column==n/2)&& row!=0 || row==0 && column!=n/2 || row==n/2)

				System.out.print("*");

		    else

		      System.out.print(" ");
		   }

		     System.out.println();
		}
      }

      public static void main(String[] args){

		  Scanner scan = new Scanner(System.in);
		  AlphaAPattern a = new AlphaAPattern();
		  a.display(6);
	  }
}