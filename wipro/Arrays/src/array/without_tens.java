package array;

import java.util.Arrays;

public class without_tens {

	public static void main(String[] args) {
		int[] arr= {1,10,10,2};
		int[] arr1=new int[4];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=10) {
				arr1[index]=arr[i];
				index++;
				
			}
			
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		

	}

}
