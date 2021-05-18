// WAP to print the elements of an array present on even position.

package src.com.mkpits.java.practiceprogram;

public class PrintArrayElementOnEvenPosition {
    public static void main(String[] args){
        int arr[] = new int[]{ 1,4,2,5,7,8};
        for(int i=1;i<arr.length;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
