package first_project;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		if(a>b && a!=b ) {
			System.out.println(b +" "+a);
		}
		else if(a<b) {
			System.out.println(a +" "+b);
			
		}

	}

}
