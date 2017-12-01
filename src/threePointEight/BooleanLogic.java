package threePointEight;

public class BooleanLogic {
	public static void main(String[] args) {
		System.out.println(powerOfTwoTwo(32)); //true
		System.out.println(powerOfTwoTwo(31)); //false
		System.out.println(powerOfTwoTwo(64)); //true
		System.out.println(powerOfTwoTwo(1)); //true
	}
	
	public static boolean powerOfTwo(int num) {
		int power = 0;
		
		while(Math.pow(2, power) <= num) {
			if (Math.pow(2, power) < num) {
				power++;
			} else if (Math.pow(2, power) == num) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean powerOfTwoTwo(int num) {
		double number = num;
		number = Math.sqrt(number);
		return ((number %= 1) == 0);
	}
}