// WAP in java to reverse a string without using string inbuilt function.

package src.com.mkpits.java.practiceprogram;

class ReverseStringExample{
    public static void main(String[] args){

        int arr[]= {33,4,5,76};
        System.out.println("Array is :");
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

        System.out.println("Array in reverse array :");

        for(int i=(arr.length)-1;i>=0;i--){

            System.out.println(arr[i]);
        }

		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter array element");
		for(int i=1;i<=size;i++){

			arr[i] = sc.nextInt();


	} */

    }
}
