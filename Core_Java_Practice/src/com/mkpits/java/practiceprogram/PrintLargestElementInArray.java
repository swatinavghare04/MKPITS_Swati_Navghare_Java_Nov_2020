// WAP to print the largest element in an array.

package src.com.mkpits.java.practiceprogram;

public class PrintLargestElementInArray {
    public static void main(String[] args){
        int arr[] = new int[]{25,11,7,75,56};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Largest element in the array is :" + max);
    }

}
