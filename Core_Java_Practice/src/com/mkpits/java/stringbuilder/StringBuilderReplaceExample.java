// StringBuilder replace() method

class StringBuilderReplaceExample
{
 public static void main(String[] args)
 {
  StringBuilder sb = new StringBuilder("Hello");
  sb.replace(1,3,"Java");
  System.out.println(sb);//print HJavalo
 }
}