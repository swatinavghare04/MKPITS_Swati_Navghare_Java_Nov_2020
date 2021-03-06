// call by value

class TestCallbyValue
{
 int data = 50;
 void change(int data)
 {
 data = data+100;
 System.out.println("value inside th method = " +data);
 }
 public static void main(String[] args)
 {
  TestCallbyValue op = new TestCallbyValue();
  System.out.println("value before change = " + op.data);
  op.change(500);
  System.out.println("value after change = " + op.data);
 }
}