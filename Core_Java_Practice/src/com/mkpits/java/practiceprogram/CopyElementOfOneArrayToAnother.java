// WAP to copy all elements of one array into another array.

package src.com.mkpits.java.practiceprogram;

public class CopyElementOfOneArrayToAnother {
    public static void main(String[] args) {
        int arr1[] = new int[]{3, 5, 6, 8, 7, 1};
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Elements of original array");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println();

        System.out.println("Copied elements are");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}