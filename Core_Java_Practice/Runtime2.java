// Java Runtime exec() method for shutdown

public class Runtime2{

   public static void main(String[] args)throws Exception{

      Runtime.getRuntime().exec("shutdown -s -t 0");
   }
}