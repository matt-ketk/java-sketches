package fourPointOne;

public class DiceRolls {
	public static void main(String[] args) {
		
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
			switch(array[i]):
				case 1:
					ones++;
					break;
				case 2:
					twos++;
					break;
				case 3:
		}
	}
}