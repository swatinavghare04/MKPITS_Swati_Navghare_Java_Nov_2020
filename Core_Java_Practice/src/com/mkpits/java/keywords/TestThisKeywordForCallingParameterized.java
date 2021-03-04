// called parameterized constructor throgh default constructor;--using this keyword

class TestA3
{
 int x;

    TestA3()
 {
 this(10);
  x = 20;
  System.out.println("hello x ="+ x);  //20
}
    TestA3(int x)
{
 System.out.println(x); //10
}
}

class TestThisKeywordForCallingParameterized
{
  public static void main(String[] args)
  {
      TestA3 a1 = new TestA3();
  }
}

