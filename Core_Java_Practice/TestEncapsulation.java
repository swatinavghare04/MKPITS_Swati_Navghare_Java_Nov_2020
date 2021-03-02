// java class to test the encapsulatedclass

package com.mk;
class TestEncapsulation
{
  public static void main(String[] args)
{
 // creating instance of the encapsulated class
PackageStudent1 s = new PackageStudent1();
// setting value in the name member
s.setName("Sonu");
// getting valu of the name member
System.out.println(s.getName());

}
}
