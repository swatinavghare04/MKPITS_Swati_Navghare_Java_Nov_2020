// called default constructor throgh parameterized constructor;--using this keyword

class TestA1
{
 int x;

    TestA1()
 {
  x = 20;
  System.out.println("hello x ="+ x);
}
    TestA1(int x)
{
 this();
 System.out.println(x);
}
}

class TestThisKeywordForCallingDefault
{
  public static void main(String[] args)
  {
      TestA1 a1 = new TestA1(10);
  }
}

