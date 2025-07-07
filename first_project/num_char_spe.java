package first_project;

import java.util.Scanner;

public class num_char_spe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char n1=sc.next().charAt(0);
		if(n1>='0' &&a n1<='9') {
			System.out.println("The number is digit");
		}
		else if((n1>='a' && n1<='z') || (n1>='A' && n1<='Z')) {
			System.out.println("The number is character");
			
		}
		else {
			System.out.println("The number is special symbol");
		}

	}

}
