/**
 * 
 */

/**
 * @author vstanfield
 *
 */
import java.util.Scanner;
public class Gal2Lit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double gallons, liters;
			
			Scanner in =  new Scanner(System.in);
			
			System.out.println("Enter gallons:");
			gallons = in.nextDouble();
			System.out.println("Gallons: "+ gallons);
			
			liters=gallons*3.78541178;
			System.out.println("Liters " + liters);
			in.close();
	}

}
