// WAP to demonstrate example of passing this as an argument.

package src.com.mkpits.java.practiceprogram;

class ThisExample{
    int x,y;

    ThisExample(int x, int y){
        this.x = x;
        this.y = y;

        //value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method :");
        System.out.println("x = "+ this.x + ", y = " + this.y);

        // call add() method passing this as argument
        add(this);

        //value of x and y after calling add()
        System.out.println("After passing this to addTwo() method :");
        System.out.println("x = "+ this.x + ", y = " + this.y);
    }
    void add(ThisExample e){
        e.x += 2;
        e.y += 2;
    }

}
public class PassThisAsArgument {
    public static void main(String[] args){
        ThisExample obj1 = new ThisExample(1,-2);
    }
}
