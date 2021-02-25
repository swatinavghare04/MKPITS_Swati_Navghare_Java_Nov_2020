// static String equalsIgnoreCase(String another) - compare another String. It doesn't check case

class Stringex9
{
  public static void main(String[] args)
  {
    String fname = "Swati";
    String Iname = "swati";
    boolean s = fname.equalsIgnoreCase(Iname);
    System.out.println(s);

  }
}