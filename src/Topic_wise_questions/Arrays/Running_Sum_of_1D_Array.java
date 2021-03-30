package Topic_wise_questions.Arrays;
import java.util.*;
/*
 *Given an array we have to find running sum of the array
 *Definition of running sum runningSum[index] = SUM(array[0..index])
 */
class Running_Sum_of_1D_Array {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int index = 0;
        for ( int i : nums) {
            sum += i;
            nums[index] = sum;
            index++;
        }
        return nums;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array to find running Sum");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //Declaring array to store data
        int[] dataArray = new int[size];
        System.out.println("Enter the array elements");
        for ( int i=0; i<size; i++) {
            dataArray[i] = sc.nextInt();
        }
        dataArray = runningSum(dataArray);
        printArray(dataArray);
    }
    public static void printArray(int[] data) {
        for(int i : data) {
            System.out.print(i + " ");
        }
    }
}