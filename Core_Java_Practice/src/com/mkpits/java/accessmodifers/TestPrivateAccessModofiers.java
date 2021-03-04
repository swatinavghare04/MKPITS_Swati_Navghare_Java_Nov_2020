// WAP in java to illustrate private access modifiers

class TestA5
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

class TestPrivateAccessModofiers
{
 public static void main(String[] args)
 {
     TestA5 ex = new TestA5();
   ex.showmsg();
 }
}