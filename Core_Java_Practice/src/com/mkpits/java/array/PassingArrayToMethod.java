// WAP in java to demonstrate program - passing array to method.

class PassingArrayToMethod
{
	// creating a method
  static void min(int arr[])
  {
	  int min =arr[0];
	  for(int i = 1;i<arr.length;i++)
	  if(min>arr[i])
	  min=arr[i];
	  System.out.println(min);
	  }
 public static void main(String[] args)
 {
   int a[] = {33,3,2,4}; //declaration and instantiation
    min(a); // passing arry to method
 }
}