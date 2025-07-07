/*package array;

import java.util.Scanner;

public class check_given_no_prese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("The elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		int target = sc.nextInt();
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				System.out.println("The target is found");
				flag = false;
				break;

			}

		}
		if (flag) {
			System.out.println("The target is not found");
		}

	}
}
*/
package array;
import java.util.Scanner;

public class check_given_no_prese {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("The elements are ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
		boolean flag=true;
		int target = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == target) {
				System.out.println(i);
				flag=false;
				break;
				

			}
			
			

		}
		if(flag) {
			System.out.println(-1);
		}
		
		
		
		

	}
}
