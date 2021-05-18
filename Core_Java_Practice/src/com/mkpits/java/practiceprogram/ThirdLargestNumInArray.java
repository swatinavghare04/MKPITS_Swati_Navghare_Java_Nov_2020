// WAP to find third largest number in an array

package src.com.mkpits.java.practiceprogram;

public class ThirdLargestNumInArray {
    public static int getThirdLargest(int a[],int total){
        int temp;
        for(int i=0;i<total;i++){
            for(int j=i+1;j<total;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
        return a[total-3];
    }
    public static void main(String[] args){
        int a[] = {1,3,5,6,8,9};
        int b[] = {55,76,44,88,22,66,99};
        System.out.println("Third Largest" + getThirdLargest(a,6));
        System.out.println("Third Largest" + getThirdLargest(b,7));
    }
}
