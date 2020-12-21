package lambtonbank;
/**
 * @author nishantraina-509
 *
 */

import java.util.List;
import java.util.Scanner;

import lambtonbank.Customerdetails;

import java.io.*;
public class db {
	
	
	static void createNewAccount()
	{
		int account = 0;
		Scanner myinput2 = new Scanner(System.in);
		
		Customerdetails u= new Customerdetails(null, null, null, null, null, null, null, "0", null, null);
		System.out.println("|Enter First Name|");
		u.fn = myinput2.nextLine();
		System.out.println("|Enter Last Name|");
		u.ln = myinput2.nextLine();
		System.out.println("|Enter Email add|");
		u.email = myinput2.nextLine();
		System.out.println("|Enter Phone|");
		u.phno= myinput2.nextLine();
		System.out.println("|Enter Sin|");
		u.sin= myinput2.nextLine();
		System.out.println("|Enter add|");
		u.add = myinput2.nextLine();
		System.out.println("|Select Bank Account Type|");
		System.out.println("|1.Savings Account|");
		System.out.println("|2.Chqueing Account|");
				account = myinput2.nextInt();
		
		u.svng = Customerdetails.randomaccgenertor();
		u.spin = Customerdetails.randompingenerator();
		System.out.println("|Your Account Number is"+ u.svng + ",and Pin is "+ u.spin+"|");
		
		if(account == 1){
			u.accountType = "Saving";
		}
		else if(account==2){
			u.accountType = "Chequing";
		}
		else {
			System.out.println("|Please Try Again Later!|");
		}
		
		   
        try
        {
         File f=new File("Database.txt");
         PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
         pw.append(u.fn+","+u.ln+","+u.email+","+u.phno+","+u.sin+","+u.add+","+u.svng+","+u.spin+","+u.balance+","+u.accountType);
         pw.close();
         File r= new File(u.svng+u.spin+".txt");
         PrintWriter rpw= new PrintWriter(new FileOutputStream(r,true));
         rpw.append(u.fn+","+u.ln+","+u.email+","+u.phno+","+u.sin+","+u.add+","+u.svng+","+u.spin+","+u.balance+","+u.accountType);
         rpw.close();
         
        }
        catch(Exception e){
        	
        }
        
        System.out.println("Thank You for Visiting !");
        System.out.println("Successfully Created Account");
       }

	static boolean oldAccount(String totalInput){
		String old = "temp";
		try
        {
         File r= new File(totalInput+".txt");
         Scanner reader = new Scanner(r);
         while (reader.hasNextLine()) {
             old = reader.nextLine();
           }
         reader.close();
         String[] old1 = old.split(",");
         System.out.println("---------Welcome"+old1[0]+" "+old1[1]+"---------");

         
        }
        catch(Exception e){
        	
        }
		return true;
		
	}
	
	//uses to update account details
	static void updateAccount(int option,String custnumbr) {
		
		Scanner myinput = new Scanner(System.in);
		String old = "temp!";
		try
        {
         File r= new File(custnumbr+".txt");
         Scanner reader = new Scanner(r);
         while (reader.hasNextLine()) {
             old = reader.nextLine();
           }
         reader.close();
         String[] old1 = old.split(",");
         
         switch(option) {
         //u.fn+","+u.ln+","+u.email+","+u.phno+","+u.sin+","+u.add+","+u.svng+","+u.spin
         //email1
         case 1:
        	 System.out.println("|New Email|");
        	 old1[2]= myinput.nextLine(); 
        	 break;
        //phone2
         case 2:
        	 System.out.println("|New Phone Number|");
        	 old1[3]= myinput.nextLine();
        	 break;
        	 //sin3
         case 3:
        	 System.out.println("|Corrected SIN|");
        	 old1[4]= myinput.nextLine();
             break;
             //add4
         case 4:
        	 System.out.println("|Your New Address|");
        	 old1[5]= myinput.nextLine();
             break;
         default:
           break;
       }
         clearFile(custnumbr);
         File x= new File(custnumbr+".txt");
         PrintWriter rpw1= new PrintWriter(new FileOutputStream(x,true));
         rpw1.append(old1[0]+","+old1[1]+","+old1[2]+","+old1[3]+","+old1[4]+","+old1[5]+","+old1[6]+","+old1[7]+","+old1[8]+","+old1[9]);
         
         rpw1.close();
        }
        catch(Exception e){
        	
        }
       
		System.out.println("|Update Succesfull!|");
	}
	
	
	public static void clearFile(String fileN) throws IOException {
        FileWriter fwOb = new FileWriter(fileN+".txt", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }
	
	public static String[] readFile(String custnumbr) {
		String[] old1 = new String[11];
		Scanner myinput = new Scanner(System.in);
		String old = "allo!";
		try {
         File r= new File(custnumbr+".txt");
         Scanner reader = new Scanner(r);
         while (reader.hasNextLine()) {
             old = reader.nextLine();
             reader.close();
             old1 = old.split(",");
             }
         }
		catch(Exception E) {
			
		}
		
		
		return old1;
	}
	
	public static String[] writeFile(String custnumbr, String[] old1) {
		   
        try
        {
            File x= new File(custnumbr+".txt");
            PrintWriter rpw1= new PrintWriter(new FileOutputStream(x,true));
            rpw1.append(old1[0]+","+old1[1]+","+old1[2]+","+old1[3]+","+old1[4]+","+old1[5]+","+old1[6]+","+old1[7]+","+old1[8]+","+old1[9]);
            
            rpw1.close();
         
        }
        catch(Exception e){
        	
        }
        
        return old1;
	}
	public static void updateFoo(int option,String custnumbr) throws IOException{
		String[] old1 = readFile(custnumbr);
		Scanner myinput = new Scanner(System.in);
		switch(option) {
   
        case 1:
       	 System.out.println("|New Email|");
       	 old1[2]= myinput.nextLine(); 
       	 break;
       //phone2
        case 2:
       	 System.out.println("|New Phone Number|");
       	 old1[3]= myinput.nextLine();
       	 break;
       	 //sin3
        case 3:
       	 System.out.println("|Corrected SIN|");
       	 old1[4]= myinput.nextLine();
            break;
            //add4
        case 4:
       	 System.out.println("|Your New Address|");
       	 old1[5]= myinput.nextLine();
            break;
        default:
          break;
          
          
          
          
      }
	clearFile(custnumbr);
	writeFile(custnumbr,old1);
	}
	
	public static void showuser(String custnumbr) throws IOException{
		String[] old1 = readFile(custnumbr);
		Scanner myinput = new Scanner(System.in);
		System.out.println("|First Name  "+old1[0]+" |");
		System.out.println("|Last Name  "+old1[1]+" |");
		System.out.println("|Email  "+old1[2]+" |");
		System.out.println("|Phone  "+old1[3]+" |");
		System.out.println("|Sin "+old1[4]+" |");
		System.out.println("|Address  "+old1[5]+" |");
		System.out.println("|Account Type  "+old1[9]+" |");
		
}
	
}

  