
package array;
import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int s=0;
		int avg;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("The elements are ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			s=s+arr[i];
			
			
		}
		System.out.println("The sum is "+s);
		avg=s/n;
		System.out.println("The average is "+avg);
		
		

	}

}
