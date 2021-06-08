// WAP to calculate discount.

package src.com.mkpits.java.practiceprogram;

import java.sql.SQLSyntaxErrorException;

public class CalculateDiscount {
    public static void main(String[] args){
        double dis,amount,markedprice,sp;
        markedprice = 1000;
        dis = 25;
        System.out.println("markedprise" + markedprice);
        System.out.println("discount rate = "+dis);
        sp = 100-dis;
        amount = (sp*markedprice)/100;
        System.out.println("amount after discount"+ amount);
    }
}
