//WAP to left rotate the elements of an array

package src.com.mkpits.java.practiceprogram;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class LeftRotateElementOfArray {
    public static void main(String[] args){

        int arr[] = new int[]{1,2,3,4,5};
        // n determines the number of times the array should be rotate
        int n = 4;

        for(int i=0;i<n;i++){
            int j,first;
            first = arr[0];

            for(j=0;j<(arr.length)-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println();

        // Displaying the result after left rotate

        System.out.println("Result after left rotate");

        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]+ " ");
        }
    }
}
