/*package first_project;

import java.util.Scanner;

public class a_A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String  b=a.toUpperCase();
		System.out.println(b);
		
		
		

	}

}
*/
package first_project;
import java.util.Scanner;

public class a_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }

        String result = new String(chars);
        System.out.println("Uppercase: " + result);
    }
}

