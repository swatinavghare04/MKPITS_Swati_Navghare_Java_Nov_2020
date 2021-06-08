// WAP to right rotate the element of an array.

package src.com.mkpits.java.practiceprogram;

public class RightRotateElementOfArray {
    public static void main(String[] args){

        int arr[] = new int[]{1,2,3,4,5};
        // n determines the number of times the array should be rotate
        int n = 4;

        // Printing original array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0;i<n;i++){
            int j,last;
            last = arr[arr.length-1];

            for(j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[j] = last;
        }
        System.out.println();

        // Displaying the result after left rotate

        System.out.println("Result after left rotate");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]+ " ");
        }
    }
}
