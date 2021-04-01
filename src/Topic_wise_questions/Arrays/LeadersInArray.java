package Topic_wise_questions.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> alist = leaders(arr,size);
        printArrayList(alist);
    }
    static ArrayList<Integer> leaders(int[] arr, int n){
        // Your code here
        ArrayList<Integer> alist = new ArrayList<>();
        int leader = -1;
        for (int i=n-1; i>=0; i--) {
            if (leader <= arr[i]) {
                alist.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.reverse(alist);
        return alist;
    }
    public static void printArrayList(ArrayList<Integer> alist) {
        for (int i : alist) {
            System.out.print(i+" ");
        }
    }
}
