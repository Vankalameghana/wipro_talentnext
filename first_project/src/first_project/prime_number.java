package first_project;

import java.util.Scanner;

public class prime_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) { // check each number from 2 to n
            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) { // prime has exactly 2 divisors
                System.out.println(num);
            }
        }
    }
}
