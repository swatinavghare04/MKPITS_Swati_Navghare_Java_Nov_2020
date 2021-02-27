 // wap in java to calculate profit and loss on a transaction;

 import java.util.*;
 class PL
 {
 public static void main(String[] args)
 {
 int sp,cp,profit,loss;
 Scanner pt = new Scanner(System.in);
 System.out.println("enter the value of selling price");
 sp = pt.nextInt();
 System.out.println("enter the value of cost price");
 cp = pt.nextInt();
 profit = sp - cp;
 loss = cp - sp;
 System.out.println("Profit = "+ profit + "\n"+ "Loss = "+ loss);
 }
 }