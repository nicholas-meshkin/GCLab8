import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.IndexOutOfBoundsException;

public class GCLab8 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String[] names = { "Nicholas Meshkin", "Derek Quinn", "Kyle Dixon", "Jason Westbrook", "Schuyler von Oeyen",
				"Kathleen Harrell", "Theo Einstein", "Luke Lorenger", "Krzysztof Grabka", "Sunceray Patterson",
				"Norvell Robinson", "Lauren Mattes", "George Icsman", "Carl Scozzari", "Michael Alexander II",
				"Cynthia Turner", "Thomas Hagey" };

		String[] hometown = { "Chennai, India", "Hiroshima, Japan", "Santiago, Chile",
				"Brazzaville, Republic of the Congo", "Barcelona, Spain", "Phnom Penh", "Isfahan, Iran",
				"Baghdad, Iraq", "Sofia, Bulgaria", "Yerevan, Armenia", "Semarang, Indonesia", "Yokohama, Japan",
				"Chongquing, China", "Santa Cruz de la Sierra, Bolivia", "Pyongyang, North Korea", "Nagpur, India",
				"Paris, France" };

		String[] favFood = { "Sweet & Sour Chicken", "Spaghetti Bolognese", "Couscous", "Honeymelon with Ham",
				"Australian Meat Pie", "Aioli", "Quesadillas", "Chicken Nuggets", "Spaetzle", "Whipped Cream", "Steak",
				"Bratkartoffeln", "Roast Chicken", "Chicken Tikka Masala", "Cucumber Salad with Sour Cream and Garlic",
				"Goulash", "Quiche" };

		String userChoice;
		String userCont = "yes";
		String knowMore = "yes";
		int userInput = 0;
		System.out.println("Welcome to our Java class.");
		do {
			do {
				System.out.println("Which student would you like to learn more about? (enter a number 1-17):");
				try {
					userInput = scnr.nextInt();
					System.out.println("Student " + userInput + " is " + names[userInput - 1] + ".");
					scnr.nextLine();
				} catch (InputMismatchException | IndexOutOfBoundsException ex) {
					System.out.println("Your input was invalid. Please try again.");
					userInput = 0;
					scnr.nextLine();
				}
			} while (userInput <= 0 || userInput >= 18);
			System.out.println(userInput);
			do {
				System.out.println("What would you like to know about " + names[userInput - 1]
						+ "? (enter \"hometown\" or \"favorite food\")");
				userChoice = scnr.nextLine();
				if (userChoice.equalsIgnoreCase("hometown") || userChoice.equalsIgnoreCase("favorite food")) {
					if (userChoice.equalsIgnoreCase("hometown")) {
						System.out.println(names[userInput - 1] + " is from " + hometown[userInput - 1]
								+ ". Would you like to know more? (enter \"yes\" to continue or anything else to return to student choice)");
						knowMore = scnr.nextLine();
					}
					if (userChoice.equalsIgnoreCase("favorite food")) {
						System.out.println(names[userInput - 1] + "'s favorite food is " + favFood[userInput - 1]
								+ ". Would you like to know more? (enter \"yes\" to continue or anything else to return to student choice)");
						knowMore = scnr.nextLine();
					}
				} else {
					System.out.println("That data does not exist. Please try again.");
				}
			} while (knowMore.equalsIgnoreCase("yes"));
			System.out.println(
					"Would you like to know about another student? (enter \"yes\" to continue or anything else to quit");
			userCont = scnr.nextLine();

		} while (userCont.equalsIgnoreCase("yes"));
		System.out.println("Thanks for getting to know our class! Goodbye.");
		scnr.close();

	}

}
