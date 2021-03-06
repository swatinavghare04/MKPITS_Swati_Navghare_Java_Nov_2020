/* WAP in java for numeric pattern - Binary Number Pattern which is given below-

10101
01010
10101
01010
10101

*/

public class NumberBinaryPattern{

  public static void main(String[] args){

      for (int row = 1; row <=5; row++){
                 int num;

            if(row%2 == 0) {
                num = 0;

        for (int column = 1; column<= 5; column++){
             System.out.print(num);

               num = (num == 0)? 1 : 0;
             }
           }
            else {
                 num = 1;

          for (int column = 1; column<= 5; column++){
                 System.out.print(num);

                  num = (num == 0)? 1 : 0;
               }
            }

              System.out.println();
        }
    }
}