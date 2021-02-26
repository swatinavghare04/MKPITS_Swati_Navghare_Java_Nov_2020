//  example of toString() method.

class TesttoString{

   int rollno;
   String name;
   String city;

   TesttoString(int rollno, String name, String city){

     this.rollno = rollno;
     this.name = name;
     this.city = city;
   }

   public String toString(){

       return rollno+" "+name+" "+city;
   }

   public static void main(String[] args){

       TesttoString s1 = new TesttoString(101,"raju","Amravati");
       TesttoString s2 = new TesttoString(102,"rajesh","Nagpur");

       System.out.println(s1);
       System.out.println(s2);
   }
}