// call by reference
class operation1
{
 int data = 50;
 void change(operation1 op)
 {
 op.data = op.data+100;
 System.out.println("value inside th method = " +op.data);
 }
 public static void main(String[] args)
 {
  operation1 op = new operation1();
  System.out.println("value before change = " +op.data);
  op.change(op); //passing object
   System.out.println("value after change = " +op.data);
 }
}