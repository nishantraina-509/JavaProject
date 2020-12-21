package lambtonbank;

import java.io.IOException;
import java.util.Scanner;

/**
 *@author nishantraina-509
 *
 */
public class MoneySend {
	
	public static void transferMoney(String targetnumber, String custnumbr, String money) throws IOException{
		String[] old1 = db.readFile(custnumbr);
		Scanner myinput = new Scanner(System.in);
		int amount = myinput.nextInt();
		int amount2 = Integer.parseInt(old1[8]) - amount;
		old1[8] = String.valueOf(amount2);
		System.out.println("Money Sent");
		db.clearFile(custnumbr);
		db.writeFile(custnumbr,old1);
		//transfer 
		String[] old2 = db.readFile(targetnumber);
		amount2 = Integer.parseInt(old2[8]) + amount;
		old2[8] = String.valueOf(amount2);
		System.out.println("Transfer Successful!!");
		db.clearFile(targetnumber);
		db.writeFile(targetnumber,old2);
	}
}
