package lambtonbank;
import java.io.IOException;

/**
 *
 * @author saneepkaur-070
 * @author nishantraina-509
 */
import java.util.Scanner;

import lambtonbank.Customerdetails;

public class BillPay {
	public static void payments(int code, String custnumbr) throws IOException{
		String[] old1 = db.readFile(custnumbr);
		Scanner myinput = new Scanner(System.in);
		if(code == 1) {
			System.out.println("|Enter the Bill Amount|");
			int bill = myinput.nextInt();
			int bill2 = Integer.parseInt(old1[8]) - bill;
			old1[8] = String.valueOf(bill2);
			System.out.println("|Bill Paid! Balance Left= "+old1[8]+"|");
			
		}
		else if(code == 2) {
			System.out.println("|Enter the Bill Amount|");
			int bill = myinput.nextInt();
			int bill2 = Integer.parseInt(old1[8]) - bill;
			old1[8] = String.valueOf(bill2);
			System.out.println("|Bill Paid! Balance Left= "+old1[8]+"|");
		}
		else if(code == 3) {
			System.out.println("|Enter the Bill Amount|");
			int bill = myinput.nextInt();
			int bill2 = Integer.parseInt(old1[8]) - bill;
			old1[8] = String.valueOf(bill2);
			System.out.println("|Bill Paid! Balance Left= "+old1[8]+"|");
		}
	db.clearFile(custnumbr);
	db.writeFile(custnumbr,old1);
	}
}
