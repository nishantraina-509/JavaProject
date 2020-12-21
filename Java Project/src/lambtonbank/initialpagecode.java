package lambtonbank;

import java.io.IOException;
import java.util.Scanner;
/**
 * @author nishantraina-509
 *
 */
public class initialpagecode {
	
	static void display() {
		System.out.println("------------------------------------------------------");
		System.out.println("|		Lambton Bank, Toronto		    |");
		System.out.println("------------------------------------------------------");
		System.out.println("|Kindly Select Your Option|");
		System.out.println("|1.Old User? Press 1 to Login|");
		System.out.println("|2.New Customer?Press 2 to Create|");
		}
		
		static void choice() throws IOException {
		boolean exists = false;
		int option;
		
		Scanner myinput = new Scanner(System.in);
		option = myinput.nextInt();
		
		if(option == 1) {
			System.out.println("|Enter Account No.|\n");
			myinput.nextLine();
			String userInput = myinput.nextLine();
			System.out.println("|Enter Pin/Password|\n");
			String userInput2 = myinput.nextLine();
			String custnumbr = userInput+userInput2;
			exists = db.oldAccount(custnumbr);
			String[] old1 = db.readFile(custnumbr);
			if(exists == true) {
				
				System.out.println("|Kindly Select Your Option|");
				System.out.println("|1.Check your Balance|");
				System.out.println("|2.Deposit & Withdraw Cash|");
				System.out.println("|3.Edit Details|");
				System.out.println("|4.Transfer Money To Other|");
				System.out.println("|5.Pay Bills|");
				System.out.println("|6.Show User Details|");
			
			
				int choice = myinput.nextInt();
			
				switch(choice) {
				//Update User Info!
				  case 1:
					  System.out.println("|Your Balance is|"+old1[8]);
					break;
					
				//Withdraw and Deposit!
				
				  case 2:
					  System.out.println("|1.Deposit Money|");
					  System.out.println("|2.Withdraw Money|");
					
					int transactionOption = myinput.nextInt();
				    afterlogin.transaction(transactionOption, custnumbr);
				    break;
				 
				
				  case 3:
					  System.out.println("|Enter Update Values|");
					  System.out.println("|1.Change Email|");
					  System.out.println("|2.Change Phone Number");
					  System.out.println("|3.Correct SIN|");
					  System.out.println("|4. Update your Address|");
						int updateOption = myinput.nextInt();
						db.updateFoo( updateOption, custnumbr);
					    break;
					  
					
					//Transfer
				  case 4:System.out.println("|Enter the Account Number of Reciever|");
				  myinput.nextLine();
					String transferOption = myinput.nextLine();
					
				
				    break;
						
				  //payment!	
				  case 5:
					  System.out.println("|Select Bill Payment|");
							  System.out.println("|1.EMI|");
					  System.out.println("|2.Insurance|");
					  System.out.println("|3.College Fees|");
						int paymentOption = myinput.nextInt();
					    BillPay.payments(paymentOption, custnumbr);
					    break;
				  case 6:    
						  System.out.println("|Your Personal Data is|\n");
						  db.showuser(custnumbr);
						  break;
				  
					  
				  default:

			}
				System.out.println("\n");
				System.out.println("|------ThankYou-------|");
		}
		}
		else if (option == 2) {
		db.createNewAccount();
		}
		else {
			System.out.println("That's not quite right...");
		}

		}

}
