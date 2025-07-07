package array;
import java.util.Scanner;

public class sorted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {6,3,2,2,1,9};
		for(int j=0;j<arr.length-1;j++) {
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1]) {
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
				}
				
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
