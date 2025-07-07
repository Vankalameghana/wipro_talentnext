package first_project;

import java.util.Scanner;

public class color_code {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color code (R/B/G/O/W): ");
        char color = sc.next().charAt(0);

        switch (color) {
            case 'R':
                System.out.println("Red");
                break;

            case 'B':
                System.out.println("Blue");
                break;

            case 'G':
                System.out.println("Green");
                break;

            case 'O':
                System.out.println("Orange");
                break;

            case 'W':
                System.out.println("White");
                break;

            default:
                System.out.println("Invalid color code");
                break;
        }
    }
}
