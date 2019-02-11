import java.util.Scanner;

public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		String name;
		String hobby;
		String sport;
		String color;
		String city;
		int age;
		
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("What is your hobby?");
		hobby = input.nextLine();
		System.out.println("What's your favorite sport?");
		sport = input.nextLine();
		System.out.println("What is your favorite color?");
		color = input.nextLine();
		System.out.println("What is are you from?");
		city = input.nextLine();
		System.out.println("How old are you?");
		age = input.nextInt();
		
		System.out.println(name + "'s hobby is " + hobby + ".");
		System.out.println(name + "'s favorite sport is " + sport + ".");
		System.out.println(name + "'s favorite color is " + color + ".");
		System.out.println(name + "'s from " + city + ".");
		System.out.println(name + " is " + age + " years old.");
		
		
		
	}

}
