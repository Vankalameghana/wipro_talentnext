package first_project;

import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");

       
            int n1 = sc.nextInt();

            if (n1 > 0) {
                System.out.println("The number is positive");
            } else if (n1 < 0) {
                System.out.println("The number is negative");
            } else {
                System.out.println("The number is zero");
            }
        
        sc.close();
    }
}

