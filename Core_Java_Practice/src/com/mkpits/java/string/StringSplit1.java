// String[] split(String regex, int limit)  - returns a split stringmatching regex and limit;

class StringSplit1
{
  public static void main(String[] args)
  {
    String fname = "Swati,ekta,sonu";
    String[] arr = fname.split(",",2);
    for(String s : arr)
    System.out.println(s);

  }
}