package LambtonBank;
/**
 * @author saneepkaur-070
 * @author nishantraina-509
 *
 */
import java.io.IOException;
import java.util.Scanner;

import LambtonBank.Customerdetails;

public class BillPay {
	public static void payments(int code, String usernumber) throws IOException{
		String[] existing1 = db.readFile(usernumber);
		Scanner keyboard = new Scanner(System.in);
		if(code == 1) {
			System.out.println("Please Enter Electricity Bill Amount");
			int amount = keyboard.nextInt();
			int amount2 = Integer.parseInt(existing1[8]) - amount;
			existing1[8] = String.valueOf(amount2);
			System.out.println("Electricity Bill Payment is Successful!");
			
		}
		else if(code == 2) {
			System.out.println("Paying Phone Bill of 50 CAD...");
			int amount2 = Integer.parseInt(existing1[8]) - 50;
			existing1[8] = String.valueOf(amount2);
			System.out.println("Phone Bill is Successful!");
		}
		else if(code == 3) {
			System.out.println("Please Enter Car Insurance Amount");
			int amount = keyboard.nextInt();
			int amount2 = Integer.parseInt(existing1[8]) - amount;
			existing1[8] = String.valueOf(amount2);
			System.out.println("Car Insurance Payment is Successful!");
		}
	db.clearFile(usernumber);
	db.writeFile(usernumber,existing1);
	}
}
