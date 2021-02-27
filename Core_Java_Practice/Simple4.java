//use of protected in program;

class A
{
  protected void msg()
{
 System.out.println("Hello java");
}
}

public class Simple4 extends A
{
void msg()
{
 System.out.println("Hello java");
}

public static void main(String[] args)
{
 Simple4 s = new Simple4();
  s.msg();
}
}