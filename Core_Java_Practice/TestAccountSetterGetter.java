// WAP in java to use setter and getter method.

public class TestAccountSetterGetter
{
 public static void main(String[] args)
{
 Account1 act = new Account1();

//sttting values through the setter method
act.setAcc_no(1235768909);
act.setName("Swati");
act.setEmail("navghareswati70@gmail.com");
act.setAmount(1200000f);

//getting vales through the getter method
System.out.println(act.getAcc_no()+ "," +act.getName()+ "," +act.getEmail()+ "," +act.getAmount());
}
}