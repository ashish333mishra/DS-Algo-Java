package Topic_wise_questions.Arrays;
import java.util.*;

public class Kids_with_greatest_number_of_candies {
    public static void main(String[] args) {
        System.out.println("Enter the size of array to find Kid with greatest Number of Candies");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //Declaring array to store data
        int[] kidsArray = new int[size];
        System.out.println("Enter the kids with candies Number");
        for (int i = 0; i < size; i++) {
            kidsArray[i] = sc.nextInt();
        }
        System.out.println("Enter The Number of Extra Candies");
        int extraCandies = sc.nextInt();
        List<Boolean> kids = kidsWithCandies(kidsArray,extraCandies);
        for (int i=0; i<kids.size(); i++) {
            System.out.print(kids.get(i) + " ");
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<Boolean>();
        int maxElement = findMax(candies);
        for ( int i : candies) {
            if ( i + extraCandies >= maxElement)
                kids.add(true);
            else
                kids.add(false);
        }
        return kids;
    }
    public static int findMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
