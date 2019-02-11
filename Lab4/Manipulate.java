import java.util.Scanner;

public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n1 ,n2;
		System.out.println("Enter first number: ");
		n1 = input.nextInt(); 
		System.out.println("Enter second number: ");
		n2 = input.nextInt();
		System.out.println("Addition = " + (n1 + n2));
		System.out.println("Subtraction = " + (n1 - n2));
		System.out.println("Multiplication = " + (n1 * n2));
		System.out.println("Division = " + (n1/n2));
		System.out.println("Remainder = " + (n1 % n2));
		
		short n3 ,n4;
		System.out.println("Enter first number:");
		n3 = input.nextShort();
		System.out.println("Enter second number:");
		n4 = input.nextShort();
		short add_short = (short)(n3 + n4);
		System.out.println("Addition = " + add_short);
		System.out.println("Subtraction = " + (n3 - n4));
		System.out.println("Multiplication = " + (n3 * n4));
		System.out.println("Division = " + (n3 / n4));
		System.out.println("Remainder = " + (n3 % n4));
		
		float n5 ,n6;
		System.out.println("Enter first number:");
		n5 = input.nextFloat();
		System.out.println("Enter second number:");
		n6 = input.nextFloat();
		float mul_float = (float)(n5 * n6);
		System.out.println("Addition = " + (n5 + n6));
		System.out.println("Subtraction = " + (n5 - n6));
		System.out.println("Multiplication = " + mul_float);
		System.out.println("Division = " + (n5 / n6));
		System.out.println("Remainder = " + (n5 % n6));
		
		double n7 ,n8;
		System.out.println("Enter first number:");
		n7 = input.nextDouble();
		System.out.println("Enter second number:");
		n8 = input.nextDouble();
		double sub_double = (double)(n7 - n8);
		System.out.println("Addition = " + (n7 + n8));
		System.out.println("Subtraction = " + sub_double);
		System.out.println("Multiplication = " + (n7 * n8));
		System.out.println("Division = " + (n7 / n8));
		System.out.println("Remainder = " + (n7 % n8));
		
	}

}
