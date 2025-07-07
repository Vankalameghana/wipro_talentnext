package first_project;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		int  original=n;
		while(n>0) {
			int d=n%10;
			r=r*10+d;
			n=n/10;
			
		}
		System.out.println(r);
		if(original==r) {
			System.out.println("The palindrome");
		}
		else {
			System.out.println("Not palindrome");
			
		}

	}

}
