package array;

public class remove_duplicate {

	public static void main(String[] args) {
		
		int arr[] = {10, 10, 20, 30, 20, 40, 50};
		
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = 0; j < arr.length; j++) {
				if(i!=j && arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
