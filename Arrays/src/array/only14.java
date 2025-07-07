package array;

public class only14 {

	public static void main(String[] args) {
		int[] arr= {1,4,4,1,2,2,3,3,3,4};
		int n=arr.length;
		boolean flag=true;
		for(int i=0;i<n;i++) {
			if(arr[i]!=1 && arr[i]!=4) {
				System.out.println("false");
				flag=false;
				break;
			}
			
			
		}
		if(flag) {
			System.out.println("true");
		}

	}

}
