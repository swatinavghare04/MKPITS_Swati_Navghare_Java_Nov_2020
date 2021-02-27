// Left Triangle Pascals

class LeftTrianglePascalStar{

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

    for(i=1;i<=4;i++){

      for(int p=1;p<=i;p++){

        System.out.print(" ");
     }

     for(int m=4;m>=i;m--){

     System.out.print("*");
     }

        System.out.println();
   }
  }
 }