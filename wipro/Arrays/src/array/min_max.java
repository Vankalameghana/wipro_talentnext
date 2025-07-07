/*package first_project;

import java.util.Scanner;
import java.util.Arrays;

public class min_max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("The elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		Arrays.sort(arr);
		System.out.println("The min "+arr[0]);
		System.out.println("The max "+arr[n-1]);

	}

}
*/
package first_project;

import java.util.Scanner;


public class min_max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("The elements are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			else if(arr[i]>min) {
				min=arr[i];
				
			}
		}
		System.out.println("The max "+max);
		System.out.println("The min "+min);


	}

}

