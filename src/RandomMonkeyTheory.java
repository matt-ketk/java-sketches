import java.util.Scanner;

public class RandomMonkeyTheory {
	public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
		TypecastMethod(console);
	}

	public static int Random(int max) {
		int random;
		random = (int) (Math.random() * (max) + 1);
		return random;
	}

	public static void TypecastMethod(Scanner console) {
        String word;
        String randomString;
		long startTime;
		long endTime;
		int wordLength;
		int counter;

        System.out.println("Type in a lowercase string (4-6 letters recommended):")
        word = console.nextLine();

		startTime = System.currentTimeMillis();
		randomString = "";
		wordLength = word.length();
		counter = 0;

		while (!word.equals(randomString)) {
			randomString = "";
			counter++;
			for (int i = 0; i < wordLength; i++) {
				randomString += (char) (Random(26) + 96);
			}

			System.out.println(counter + " " + randomString);
		}
		endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime + " ms");
	}

}
