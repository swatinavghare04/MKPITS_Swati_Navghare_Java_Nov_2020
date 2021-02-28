//private access modifiers

class TestPrivateAccessModofiers
{
private int a = 20;
 private void msg()
 {
    System.out.println("Hello" + a);
 }
  public void showmsg()
  {
   a = 40;
   msg();
  }
}

class Test34
{
 public static void main(String[] args)
 {
   A ex = new A();
   ex.showmsg();
 }
}