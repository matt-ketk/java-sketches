package fourPointOne;

public class PrintTheFirstLetter {
	public static void main(String[] args) {
		
	}
	
	public static void printFirstArr(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i].charAt(0));
		}
		System.out.println();
	}
}