package first_project;

import java.util.Scanner;

public class primernot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag && n>1) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}

	}

}
