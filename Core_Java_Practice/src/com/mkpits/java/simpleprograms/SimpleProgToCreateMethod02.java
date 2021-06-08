package src.com.mkpits.java.simpleprograms;

public class SimpleProgToCreateMethod02 {
    // create method
    public int addNumbers(int a, int b){
        int sum = a+ b;
        return sum;
    }
    public static void main(String[] args){
        int num1 =3, num2 = 6;
        SimpleProgToCreateMethod02 obj = new SimpleProgToCreateMethod02();
        int result = obj.addNumbers(num1,num2);
       System.out.println("Sum is :" + result);
    }
}
