package array;
import java.util.Scanner;

public class larg_2_smal_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2, 9, 5, 0, 2, 8};
        int large = arr[0];
        int secondlarge = arr[0];
        int small = arr[0];
        int secondsmall = arr[0];

        for (int i = 0; i < arr.length; i++) {
            // Find largest and second largest
            if (arr[i] > large) {
                secondlarge = large;
                large = arr[i];
            } else if (arr[i] > secondlarge && arr[i] != large) {
                secondlarge = arr[i];
            }

            // Find smallest and second smallest
            if (arr[i] < small) {
                secondsmall = small;
                small = arr[i];
            } else if (arr[i] < secondsmall && arr[i] != small) {
                secondsmall = arr[i];
            }
        }

        System.out.println("Second Largest: " + secondlarge);
        System.out.println("Second Smallest: " + secondsmall);

        sc.close();
    }
}
