// String Builder append() method concatenates the given argument with this String.

public Class StringBuilderEx
{
public static void main(String[] args)
{
  StringBuilder sb = new StringBuilder("Hello");
  sb.append("Java"); // now original String is changed
  System.out.println(sb);
}
}