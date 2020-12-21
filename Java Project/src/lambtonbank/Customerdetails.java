package lambtonbank;
/**
 * @author Akshay
 *
 */
import java.util.Random;

public class Customerdetails {
	String fn;
	String ln;
	String email;
	String phno;
	String sin;
	String add;
	String svng;
	String balance;
	String spin;
	String accountType;


	public Customerdetails(String fn, String ln, String email, String phno, String sin, String add, String svng, String balance,String accountType ,String spin)
	{
		this.fn = fn;
		this.ln = ln;
		this.email = email;
		this.phno = phno;
		this.sin = sin;
		this.add = add;
		this.balance = balance;
		this.svng = svng;
		this.spin = spin;
		this.accountType = accountType;
	}
	
	public String toString()
	{
		return  fn + "\n" + ln + "\n" + email + "\n"
				+ phno + "\n" + sin + "\n" + add;
	}
	
	static String randomaccgenertor()
	{
		Random r = new Random();
		String accountNum=String.valueOf(r.nextInt(8999)+2963);
		return accountNum;
		
	}
	static String randompingenerator()
	{
		Random r = new Random();
		return String.valueOf(r.nextInt(8999)+3249);
	}
}
