import java.util.Scanner;

public class Errors3 {
	// forgot bracket

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		// forgot parenthesis around System.in
		int numerator;
		int denominator;
		// integer should be written as int not: Int or "integer"

		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator: ");
		// forgot out
		
		numerator = kbd.nextInt();
		
		System.out.print("Enter the denominator: ");
		
		denominator = kbd.nextInt();
		// denominator was spelled wrong

		System.out.print(numerator);
		// System needs to be capitalized
		System.out.print("/");
		System.out.print(denominator);
		//print need to be lower case
		// System needs to be capitalized
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
		// print needs to be lowercase
	}
	
}
