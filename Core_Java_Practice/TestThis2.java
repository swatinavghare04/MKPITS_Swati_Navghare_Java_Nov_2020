// called parameterized constructor throgh default constructor;--using this keyword

class A
{
 int x;

 A()
 {
 this(10);
  x = 20;
  System.out.println("hello x ="+ x);  //20
}
A(int x)
{
 System.out.println(x); //10
}
}

class TestThis2
{
  public static void main(String[] args)
  {
   A a1 = new A();
  }
}

