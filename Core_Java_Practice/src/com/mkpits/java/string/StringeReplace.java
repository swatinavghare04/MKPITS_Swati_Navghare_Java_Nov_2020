// string replace(char old,char new) -  replace all occurance of the specfied char value;


class StringeReplace
{
 public static void main(String[] args)
 {

   String fname = "Swati";
   String fullname = fname.replace('i','u');
   System.out.println("name after replace is " + fullname);
 }
}