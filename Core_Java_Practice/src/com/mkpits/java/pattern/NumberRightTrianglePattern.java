/* WAP in java for numeric pattern - Right Triangle which is given below-

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/

public class NumberRightTrianglePattern{

  public static void main(String[] args){

     for(int row=1;row<=5;row++){
       for(int column=row;column>=1;column--){

          System.out.print(column+" ");
       }

         System.out.println();
     }
  }
}