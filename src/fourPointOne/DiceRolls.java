package fourPointOne;

import java.util.Scanner;

public class DiceRolls {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many dice rolls?: ");
		rollFrequencies(console.nextInt());
	}

	public static int diceRoll() {
		return ((int) (Math.random() * 6 + 1));
	}

	public static void rollFrequencies(int numOfRolls) {
		int[] array = new int[numOfRolls];

		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = diceRoll();
		}

		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
			case 1:
				ones++;
				break;
			case 2:
				twos++;
				break;
			case 3:
				threes++;
				break;
			case 4:
				fours++;
				break;
			case 5:
				fives++;
				break;
			case 6:
				sixes++;
				break;
			default:
				break;
			}
		}

		System.out.println("Ones: " + ones);
		System.out.println("Twos: " + twos);
		System.out.println("Threes: " + threes);
		System.out.println("Fours: " + fours);
		System.out.println("Fives: " + fives);
		System.out.println("Sixes: " + sixes);
	}
}