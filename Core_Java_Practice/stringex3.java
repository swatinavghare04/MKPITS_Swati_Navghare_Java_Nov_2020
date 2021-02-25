// string method example - boolean contains(chaSequence s)


import java.util.*;
class stringex3
{
public static void main(String[] args)
{
  Scanner scan = new Scanner(System.in);
  System.out.println("enter email address");
  String s = scan.next();
  boolean s1 = s.contains(".com");
  if(s1==true)
  System.out.println("valid email");
  else
  System.out.println("invalid email");

}
}