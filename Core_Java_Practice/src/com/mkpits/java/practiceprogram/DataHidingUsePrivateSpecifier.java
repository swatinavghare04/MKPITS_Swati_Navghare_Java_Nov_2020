// WAP to demonstrate example - how to achieve data hiding using the private specifier.

package src.com.mkpits.java.practiceprogram;

class Person{
    private int age;

    // getter method
    public int getAge(){
        return age;
    }
    // setter method
    public void setAge(int age){
        this.age = age;
    }
}
public class DataHidingUsePrivateSpecifier {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setAge(24);
        System.out.println("My age is : "+ p1.getAge());
    }
}
