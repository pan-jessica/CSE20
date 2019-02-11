import java.util.Scanner;

public class newInterviewer {

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
		int weight;
		int newWeight;
		
		System.out.println("What is your name?");
		name = input.nextLine();
		System.out.println("What is your hobby?");
		hobby = input.nextLine();
		System.out.println("What's your favorite sport?");
		sport = input.nextLine();
		System.out.println("What is your favorite color?");
		color = input.nextLine();
		System.out.println("Where are you from?");
		city = input.nextLine();
		System.out.println("How old are you?");
		age = input.nextInt();
		System.out.println("How much do you weigh in pounds?");
		weight = input.nextInt();
		
		System.out.println("Biography:");
		System.out.println(name + "'s hobby is " + hobby + " and his/her favorite sport is " + sport + ". ");
		System.out.println(name + "'s favorite color is " + color + " and he/she is from " + city + ". ");
		newWeight = (int) (weight / 2.2); 
		System.out.println(name + " is " + age + " years old and he/she weighs " + newWeight + "kg. ");
		
		
		
	}

}