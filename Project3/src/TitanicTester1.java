/** project 3
 * @author Mehjamila Bonny
 * @date March 5, 2021
 */
import java.util.ArrayList;
public class TitanicTester1
{
   public static void main(String[] args)
   {
  	// create some Passenger objects
  	   try {
	   Passenger p1 =  new Passenger (4, false, "male", false);
       Passenger p2 =  new Passenger (2, true, "female", false);

  	// Print out their info
  	System.out.println(p1);
  	System.out.println(p2);
    ArrayList<Passenger> titanic= new ArrayList<Passenger>();
    titanic.add(new Passenger(3, true,"male",false));
  	titanic.add(new Passenger (1, true, "female",true));
  	titanic.add(new Passenger (3, false,"female" ,false));
  	
  
  	// Print info about collection (should be 3 passengers, 1 survivor)
  	System.out.println(titanic);
  	   }
  	catch(OutOfRangeException e) {
  		System.out.println(e.getMessage() + "is out of range");
  	}
   }
}

