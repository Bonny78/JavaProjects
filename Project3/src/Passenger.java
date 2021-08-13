/** This is Passenger class representing passengers of Titanic
 * project 3
 * @author Mehjamila Bonny
 *@date March 5, 2021
 */
public class Passenger {

//instance variables
/** int represents Status**/
	private int status;
/** Boolean represent child if true or ADULT if false**/
	private boolean child;
/** String represents sex-male or female**/
	private String sex;
/** Boolean represnts survivor-true if survived**/
	private boolean survivor;
/** fully qualified constructor
 * @param s int
 * @param c boolean
 * @param sx STring
 * @param sv boolean
 * @throws OutOfRangeException 
 */
	public Passenger(int s, boolean c,String sx,boolean sv) throws OutOfRangeException {
		status=s;
		if(status!=1 && status!=2 && status!=3 && status!=4) {
			throw new OutOfRangeException("Error. Enter status 1-4");
		}
		child=c;
		sex=sx;
		   if((!"male".equals(sex)) && (!"female".equals(sex)) ) {
			   throw new OutOfRangeException("Error. Only male or female");
		   }
		survivor=sv;
	}
	
//getters
/**Method to get the status
 * @return int
 */
	public int getStatus() {
		return status;
	}
/**Method to get the child
 * @return boolean
 */
	public boolean getChild() {
		return child;
	}
/** Method to get the sex
 * @return String
 */
   public String getSex() {
	   return sex;
   }
/**Method to get if there's a survivor
 * @return boolean
 */
   public boolean getSurvivor() {
	   return survivor;
   }
//Setters
/**Method to set the status
 * @param s int
 */
   public void setStatus(int s) {
	   status=s;
   }
/** Method to set child
 * @param c boolean 
 */
   public void setChild(boolean c) {
	   child=c;
   }
/**Method to set sex
 * @param sx String
 */
   public void setSex(String sx) {
	   sex=sx;
   }
 /**Method to set survivor
  * @param sv boolean
  */
   public void setSurvivor(boolean sv) {
	   survivor=sv;
   }
/**toString method
 * @return String
 */
   public String toString() {
	   return status +" " + child+" "+ sex+" "+survivor +"\n";
   }
}//end class
