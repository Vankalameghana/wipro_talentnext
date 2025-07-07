package array;

import java.util.Arrays;

public class sum {

    public static void main(String[] args) {
        int arr[] = {10, 3, 6, 9, 2, 7, 1};
        int target = 22;
        int n = arr.length - 1;
        Arrays.sort(arr);
        int sum = 0;
        int i = 0;
        int j = n; 

        while (i < j) {
            if (arr[i] + arr[j] == target) {
                sum = arr[i] + arr[j];
                System.out.println(sum);
                i++;
                j--;
            } else if ((arr[i] + arr[j]) < target) {
                sum = sum + arr[i] + arr[j];
                i++; 
            } else if ((arr[i] + arr[j]) > target) {
                sum = sum + arr[i] + arr[j];
                j--; 
            }
        }
    }
}
