// WAP to sort the elements of an array in descending order.

package src.com.mkpits.java.practiceprogram;

public class SortElementOfAnArrayInDescending {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 6, 2, 9, 5, 2};
        int temp = 0;

        // Print original array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        // Array in descending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Element in ascending orde :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
