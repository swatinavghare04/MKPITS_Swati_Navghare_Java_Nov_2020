// string method example

class TestStringMethodUseForLooptoPrint
{
public static void main(String[] args)
{
 TestStringMethodUseForLooptoPrint s3 = new TestStringMethodUseForLooptoPrint("example");
 int ch = s3.length();
 for(int i = 0;i<ch;i++)
 {
 System.out.println(s3.charAt(i));
 }
}
}
