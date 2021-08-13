/** project 3
 * @author Mehjamila Bonny
 * @date March 5, 2021
 */
import java.util.ArrayList;
public class TitanicTester2 {
	public static void main(String[] args){     
		ArrayList<Passenger> titanic= new ArrayList<Passenger>();
		try {
		titanic.add(new Passenger (5, true, "male", false));
		titanic.add(new Passenger (2, true, "m", false));// exception - status cannot be 5
		}
		catch(OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}



}
