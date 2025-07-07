package first_project;

import java.util.Scanner;

public class cla_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		if (args.length != 2) {
			System.out.println("Please provide exactly two arguments");
			return;
		}
		String arg1 = args[0];
		String arg2 = args[1];
		System.out.println("Command Line Argument");
		System.out.println("The first argument is: " + arg1);
		String arg3=sc.nextLine();
		System.out.println("Enter the string:"+arg3);
		System.out.println("The second argument is: " + arg2);
	}
}