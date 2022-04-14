import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int sum = 0;
		while (n > 0) {
			++sum;
			n = n/10;
		}
		
		System.out.println("The number of digits are: " + sum);
		
		input.close();
	}
}

// Logarithmic approach
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		int res = (int) Math.floor((double) Math.log10(n) + 1);
		
		System.out.println("The number of digits are: " + res);
		
		input.close();
	}
}

// Recursive approach
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		System.out.println("The number of digits are: " + countDigits(n));
		
		input.close();
	}
	
	private static int countDigits(int n) {
		if (n <= 0) {
			return 0;
		}
		
		return 1 + countDigits(n/10);
	}
}

