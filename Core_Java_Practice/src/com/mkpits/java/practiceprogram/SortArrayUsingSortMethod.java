// WAP to sort array in ascending order using sort method.

package src.com.mkpits.java.practiceprogram;

import java.util.Arrays;
public class SortArrayUsingSortMethod {
    public static void main(String[] args){
        int arr[] = new int[]{56,3,45,23,11,20,48};
        Arrays.sort(arr);
        System.out.println("Element of sorted array in ascending form :");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
