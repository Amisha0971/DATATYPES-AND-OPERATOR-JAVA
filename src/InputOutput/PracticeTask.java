package InputOutput;

import java.util.Scanner;

public class PracticeTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter Your City:");
		String city = sc.nextLine();
		
		System.out.println("My name is " + name + " And am from " + city +".");
	}

}
