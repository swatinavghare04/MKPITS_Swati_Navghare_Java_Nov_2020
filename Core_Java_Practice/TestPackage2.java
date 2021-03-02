import mk PackageA1;
import mk PackageB1;

class TestPackage2
{
 public static void main(String[] args)
{
 PackageA1 a = new PackageA1();
a.msg();
PackageB1 b = new PackageB1();
b.msg();
}
}