// WAP for alphabate A pattern

import java.util.*;

public class AlphaAPattern{

  void display(int n){
	for(int i=0;i<=n;i++){

		for(int j=0;j<=n/2;j++){

			if((j==0||j==n/2)&& i!=0 || i==0 && j!=n/2 || i==n/2)

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