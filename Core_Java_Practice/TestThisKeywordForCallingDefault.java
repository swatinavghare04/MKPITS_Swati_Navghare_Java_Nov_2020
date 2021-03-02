// called default constructor throgh parameterized constructor;--using this keyword

class A
{
 int x;

 A()
 {
  x = 20;
  System.out.println("hello x ="+ x);
}
A(int x)
{
 this();
 System.out.println(x);
}
}

class TestThisKeywordForCallingDefault
{
  public static void main(String[] args)
  {
   A a1 = new A(10);
  }
}

