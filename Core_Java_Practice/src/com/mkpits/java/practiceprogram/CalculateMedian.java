// WAP to calculate median.

package src.com.mkpits.java.practiceprogram;

public class CalculateMedian {
    public static void main(String[] args){
        int n=5;
        double arr[] = new double[n];
        arr[0]=10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        double median =0;
        if(n%2==1){
            median = arr[(n+1)/2-1];
        }
        else{
            median = (arr[n/2-1] + arr[n/2])/2;
        }
        System.out.println("Median : "+ median);
    }
}
