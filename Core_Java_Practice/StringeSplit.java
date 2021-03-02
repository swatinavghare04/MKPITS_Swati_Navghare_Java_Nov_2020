// String[] split(String regex)  - returns a split stringmatching regex

class StringeSplit
{
  public static void main(String[] args)
  {
    String fname = "Swati,ekta,sonu";
    String[] arr = fname.split(",");
    for(String s : arr)
    System.out.println(s);

  }
}