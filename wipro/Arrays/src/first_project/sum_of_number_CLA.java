package first_project;

import java.util.Scanner;
public class sum_of_number_CLA
{
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two integers");
            return;
        }
        
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        
    }
}