
//inheritance

class employee
{
 float salary= 40000f;
}

class programmer extends employee
{
 float bonus = 1000f;
  public static void main(String[]args)
  {
    programmer p = new programmer();
    System.out.println("programmer salary = "+ p.salary);
    System.out.println("programmer bonus = "+ p.bonus);
   }
}
