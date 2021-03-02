//WAP in java - use of protected access modifiers in program;

class A
{
  protected void msg()
{
 System.out.println("Hello java");
}
}

public class ProtectedAccessModifiers extends A
{
void msg()
{
 System.out.println("Hello java");
}

public static void main(String[] args)
{
    ProtectedAccessModifiers s = new ProtectedAccessModifiers();
  s.msg();
}
}