// Example of array - Program to illustrate how to declare, instantiate, initialize and traverse the Java array. 

class TestArray4{

   public static void main(String[] args){
   
     int a[] = new int[5];
     a[0] = 10;
     a[1] = 20;
     a[2] = 30;
     a[3] = 40;
     a[4] = 50;
     
     // traversing array
     
     for(int i =0;i<=a.length;i++)  //length is the property of an array
        {
         System.out.println(a[i]);
      }
     
   }
}