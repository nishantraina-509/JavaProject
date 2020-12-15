package Banking;

import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JOptionPane;



/**
 * @author Raina
 *
 */
public class mainmenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String[] choice = {"Create an Account", "Already a customor? Login"};
		
			
			int x = JOptionPane.showOptionDialog(null, "Choose an Option","Click a Button", 
					JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE, null, choice, choice);
			
			
			System.out.println(x);
			
			
			
			
			
		

	}

}
