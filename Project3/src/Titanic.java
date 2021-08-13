/** project 3
 * Title Titanic
 * @author Mehjamila Bonny
 * @date March 5, 2021
 */
import java.util.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class Titanic {
 public static void main(String[] args) {
	ArrayList<Passenger>titanic=new ArrayList<Passenger>();
	
	Scanner inputStream =null;
	PrintWriter outputStream=null;
	
	try {
		inputStream=new Scanner(new FileInputStream("titanic_data.txt"));
		outputStream=new PrintWriter(new FileOutputStream("summary.txt"));
	}
	catch (FileNotFoundException e) {
		System.out.println("problem opening files");
		System.exit(0);
	}
	
	int s;
	boolean c,d;
	String a;
	
	while(inputStream.hasNextLine()) {
	  try {
		s=inputStream.nextInt();
		c=inputStream.nextBoolean();
		a=inputStream.next();
		d=inputStream.nextBoolean();
		
		titanic.add(new Passenger(s,c,a,d));
	  }
	  catch(OutOfRangeException e) {
		  System.out.println(e.getMessage());
	  }
	}//end while
	
	for(int i=0;i<titanic.size();i++) {
	outputStream.println(titanic.get(i));
	}
	
	//Calculate statistics for survivor
	int children=0;
	int adult=0;
	int male=0;
	int female=0;
	int totalSurvivor=0;
	for(int i=0;i<titanic.size();i++) {
		if(titanic.get(i).getChild()==true) {
			children++;
		}
		else {
			adult++;
		}
		if(titanic.get(i).getSex().equals("male")) {
			male++;
		}
		else {
			female++;
		}	
	}
	totalSurvivor+=adult+children+male+female;
	
	//statistics of survivors
	
	outputStream.println("%children is: "+ calcPercent(children,totalSurvivor));
	outputStream.println("%adult is: "+ calcPercent(adult,totalSurvivor));
	outputStream.println("%male is: "+ calcPercent(male,totalSurvivor));
	outputStream.println("%female is: "+ calcPercent(female,totalSurvivor));
	
	
	inputStream.close();
	outputStream.close();
	
	
     
 }//end main
 
 /**Method to calculate %of survivor
  * @param int
  * @return double
  */
    public static double calcPercent(int a, int b) {
    	return ((double)a/b)*100;
    }
}//end class
