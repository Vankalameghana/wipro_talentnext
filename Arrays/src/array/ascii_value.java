/*package array; // ✅ Your package

import java.util.Scanner; // ✅ Import Scanner

public class ascii_value { // ✅ Class name = file name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ASCII value: ");
        int ascii = sc.nextInt();
        System.out.println("Character: " + (char) ascii);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("ASCII value: " + (int) ch);

        sc.close();
    }
}
*/
package array; // ✅ Your package

import java.util.Scanner; // ✅ Import Scanner

public class ascii_value { // ✅ Class name = file name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int arr[]= {89,99,90,68};
       for(int i=0;i<arr.length;i++) {
    	   System.out.print((char)(arr[i]));
       }
       
    }
}

