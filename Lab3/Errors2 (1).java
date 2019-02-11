import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// not kbd
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will ");
		System.out.print("square it for you:");
		
		number =  input.nextInt();
		// forgot parenthesis

		theSquare = number * number;
		// above was written as a comment

		System.out.print(number + " squared = ");
		// forgot ending parenthesis
		System.out.println(theSquare);
		// remove quotations
	}
}