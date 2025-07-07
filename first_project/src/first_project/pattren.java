package first_project;

import java.util.Scanner;
public class pattren {

    public static void main(String[] args) {
        // Using for loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Using while loop
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 4) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
