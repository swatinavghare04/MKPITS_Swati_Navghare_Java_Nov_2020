// StringBuilder delete() method

class StringBuilderEx4
{
 public static void main(String[] args)
 {
  StringBuilder sb = new StringBuilder("Hello");
  sb.delete(1,3);
  System.out.println(sb);//print Hlo
 }
}