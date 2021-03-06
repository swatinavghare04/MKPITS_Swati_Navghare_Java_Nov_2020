// WAP in java to illustrate private constructor.
class TestA12
{
//private TestA12(){}  -  if we use private constructor te it will give compile time error.
 TestA12(){}
 void msg()
 {
   System.out.println("Hello Java");
 }
}

public class PrivateConstructor
{
 public static void main(String[] args)
 {
  TestA12 obj = new TestA12();
  obj.msg();
 }
}