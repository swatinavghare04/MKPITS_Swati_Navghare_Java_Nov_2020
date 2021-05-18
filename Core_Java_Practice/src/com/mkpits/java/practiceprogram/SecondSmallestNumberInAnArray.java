// WAP to find second smallest number in an array

package src.com.mkpits.java.practiceprogram;

public class SecondSmallestNumberInAnArray {
    public static int getSecondSmallest(int a[], int total){
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[1];
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7};
        int b[] = { 21,33,46,57,65,22};
        System.out.println("Second Smallest number :" +getSecondSmallest(a,7));
        System.out.println("Second Smallest number :" +getSecondSmallest(b,6));
    }
}
