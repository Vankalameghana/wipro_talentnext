package first_project;

import java.util.Scanner;

public class male_female_intrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equals("Female") && (age>1 && age<58  )) {
			System.out.println("the percentage of interest is  8.2%");
			
		}
		else if(gender.equals("Female")&&(age>59 && age<100)) {
			System.out.println("the percentage of interest is  9.2%");
			
		}
		else if(gender.equals("Male")&&(age>1 && age<59)) {
			System.out.println("the percentage of interest is  8.4%");
			
		}
		else if(gender.equals("Male")&&(age>59 && age<100)) {
			System.out.println("the percentage of interest is  10.5%");
			
		}

	}

}
