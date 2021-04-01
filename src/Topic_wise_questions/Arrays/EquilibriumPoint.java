package Topic_wise_questions.Arrays;
import java.io.*;
import java.util.Scanner;

public class EquilibriumPoint {
    public static void main(String[] args){
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextLong();
        }
        //Call Function
        int equinibriumpoint = equilibriumPoint(arr,size);
        //Printing the Equilibrium Point
        System.out.println(equinibriumpoint);
    }
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        if (n == 1)
            return 1;
        long rsum = 0;
        for (int i=0; i<n; i++) {
            rsum += arr[i];
        }
        long lsum = arr[0];
        for (int i=1; i < n-1; i++) {
            if (lsum == (rsum -lsum-arr[i])) {
                return i+1;
            }
            lsum += arr[i];
        }
        return -1;

    }
}
