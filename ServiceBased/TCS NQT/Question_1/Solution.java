import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	private static ArrayList<String> cps;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		cps = new ArrayList<String>();
		String platenumber;

		while (true) {
			int option = input.nextInt();
			if (option == 1) {
				platenumber = input.next();
				thePark(platenumber);
			} else if (option == 2) {
				platenumber = input.next();
				theSearch(platenumber);
			} else {
				break;
			}
		}

		input.close();
	}

	private static void thePark(String platenumber) {
		if (platenumber.length() < 6 || platenumber.length() > 12) {
			System.out.println("INVALID INPUT");
		} else {
			cps.add(platenumber);
			System.out.println("CAR PARKED AT POSITION " + cps.size());
		}
	}

	private static void theSearch(String platenumber) {
		if (platenumber.length() < 6 || platenumber.length() > 12) {
			System.out.println("INVALID INPUT");
		} else {
			int flag = 0;
			for (int i = 0; i < cps.size(); i++) {

				if (cps.get(i).equals(platenumber)) {
					flag = 1;
					System.out.println("CAR POSITION: " + (i + 1));
					cps.get(i);
				}
			}

			if (flag == 0) {
				System.out.println("CAR DOES NOT EXIST");
			}
		}
	}
}
