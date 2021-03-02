// string method example

class TestStringMethodUseForLoop
{
public static void main(String[] args)
{
 TestStringMethodUseForLoop s3 = new TestStringMethodUseForLoop("example");
 int ch = s3.length();
 for(int i = 0;i<ch;i++)
 {
 System.out.println(s3.charAt(i));
 }
}
}
