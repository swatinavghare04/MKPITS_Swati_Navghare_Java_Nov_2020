// 	final keyword - final variable

class A1
{
 final int speedlimit = 90;
 void get()
 {
 speedlimit = 400;
 }
 public static void main(String[] args)
 {
  A a = new A();
  a.get();
  }
}



error : cannot assign a value to final variable speedlimit