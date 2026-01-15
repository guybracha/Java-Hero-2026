package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Hello and Welcome, how many heroes would you like to create today?");
		int num = readInt(in);

		System.out.println("You chose " + num + ". New Array will be created now!");
		Hero[] heroes = new Hero[num];

		for (int i = 0; i < heroes.length; i++) {
			System.out.println("\n--- Creating hero " + (i + 1) + " ---");

			System.out.println("Enter Superhero Name:");
			String name = in.next();

			System.out.println("Enter Superhero power list:");
			String powers = in.next();

			System.out.println("Enter Superhero Age:");
			int age = readInt(in);

			System.out.println("Enter Superhero City:");
			String city = in.next();

			heroes[i] = new Hero(name, powers, age, city);
		}

		System.out.println("\n✅ Well Done! Here is your hero list:\n");
		printList(heroes);

		in.close();
	}

	// ✅ Safe integer input (prevents InputMismatchException)
	public static int readInt(Scanner in) {
		while (!in.hasNextInt()) {
			System.out.println("❗ Please enter a valid number!");
			in.next(); // discard invalid input
		}
		return in.nextInt();
	}

	// ✅ Proper printing
	public static void printList(Hero[] heroes) {
		for (int i = 0; i < heroes.length; i++) {
			System.out.println(heroes[i]); // auto calls toString()
		}
	}
}
