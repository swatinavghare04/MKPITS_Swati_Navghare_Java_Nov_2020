// WAP to calculate compound interest.

package src.com.mkpits.java.practiceprogram;

public class CompoundInterest {
    public static void main(String[] args){
        double amount = 0, principle=1000,rate=10,time=3,CI;
        System.out.println("Principle "+ principle);
        System.out.println("rate "+ rate);
        System.out.println("time "+ time);

        amount = principle * ((1+rate/100) * (1+rate/100) * (1+rate/100));
        System.out.println("amount = " + amount);

        CI = amount-principle;
        System.out.println("Compound Interest : " + CI);
    }
}
