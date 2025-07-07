package array;

public class even_place_odd_place {

	public static void main(String[] args) {
		int[] arr= {1,3,4,2,0,11,1,1,1};
		int n=arr.length;
		int index=0;
		
		int[] arr1=new int[n];
		for(int i=0;i<arr.length;i++) {
			if((arr[i]%2)==0) {
				arr1[index]=arr[i];
				index++;
				
			}
			
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				arr1[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
