// call by reference

class TestCallbyReference
{
 int data = 50;
 void change(TestCallbyReference op)
 {
 op.data = op.data+100;
 System.out.println("value inside th method = " +op.data);
 }
 public static void main(String[] args)
 {
  TestCallbyReference op = new TestCallbyReference();
  System.out.println("value before change = " +op.data);
  op.change(op); //passing object
   System.out.println("value after change = " +op.data);
 }
}