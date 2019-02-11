import java.util.Scanner;
	//previous program was missing import

public class Errors1 {

	public static void main(String[] args) {
		
		System.out.println("Can you spot and fix the errors?");
		// forgot ending quotation 
		System.out.print("Enter two numbers and I'll ");
		System.out.println("add them for you.");
		

		Scanner input = new Scanner(System.in);
		//new scanner should be placed above int
		//input not keyboard
		int n1, n2;
		
		n1 = input.nextInt();
		// change input to keyboard
		n2 = input.nextInt();

		System.out.println("The sum of the numbers is ");
		// System.out.println was written wrong
		System.out.println(n1 + n2); 
		// addition not subtraction
		
	}
}