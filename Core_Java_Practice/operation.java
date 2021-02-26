// call by value

class operation
{
 int data = 50;
 void change(int data)
 {
 data = data+100;
 System.out.println("value inside th method = " +data);
 }
 public static void main(String[] args)
 {
  operation op = new operation();
  System.out.println("value before change = " + op.data);
  op.change(500);
  System.out.println("value after change = " + op.data);
 }
}