package lambtonbank;
import java.io.IOException;
import java.util.Scanner;

import lambtonbank.Customerdetails;

/**
 * @author nishantraina-509
 *
 */
public class afterlogin {
	public static void transaction(int code, String custnumbr) throws IOException{
		String[] old1 = db.readFile(custnumbr);
		Scanner myinput = new Scanner(System.in);
		if(code == 1) {
			System.out.println("Please Enter Deposit Amount");
			int amount = myinput.nextInt();
			int amount2 = Integer.parseInt(old1[8]) + amount;
			old1[8] = String.valueOf(amount2);
			System.out.println("Deposit Done! Your new balance is"+amount2);
			
		}
		else if(code == 2) {
			System.out.println("Please Enter Withdraw Amount");
			int amount = myinput.nextInt();
			int amount2 = Integer.parseInt(old1[8]) - amount - 1;
			old1[8] = String.valueOf(amount2);
			System.out.println("Withdrawal Done!You Withdrawed"+amount+"Your new balance is:"+amount2);
			
			
		}
	db.clearFile(custnumbr);
	db.writeFile(custnumbr,old1);
	}
}
