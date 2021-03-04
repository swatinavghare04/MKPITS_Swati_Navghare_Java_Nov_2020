/* WAP to print the result of the specified operations-

-1 + 4 * 6
( 35+ 5 ) % 7
14 + -4 * 6 / 11
2 + 15 / 6 * 1 - 7 % 2

*/

class ResultSpecifiedOperation{

  public static void main(String[] args){
  
     int a = -1+4*6;
     int b = (35+5) % 7;
     float c = 14+(-4)*6/11;
     float d = 2 + 15 / 6 * 1 - 7 % 2;
     
     System.out.println("Result of first specified operation = "+ a);
     System.out.println("Result of second specified operation = "+ b);
     System.out.println("Result of third specified operation = "+ c);
     System.out.println("Result of forth specified operation = "+ d);
  }
}

