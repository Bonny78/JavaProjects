/*Lab 10 
 * HashMap
 * Part 1 
 * Title CityPop
 * @author Mehjamila Bonny
 * @date April 26, 2021
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Collections;

public class CityPop {
  public static void main(String[] args) {
		//declaring input and output
		Scanner inputStream=null;
		PrintWriter outputStream=null;
		
	try {
		inputStream=new Scanner(new FileInputStream("city_pop.txt"));
		outputStream=new PrintWriter(new FileOutputStream("output.txt"));
	}
	catch (FileNotFoundException e) {
		System.out.println("Problem opening file");
		System.exit(0);
	}
	
	//declare hashMap
	HashMap <String, Double> cities = new HashMap<String,Double>();
	
	//read the file into HashMap
	String s;
	double d;
	double sum=0;
	//while loop to read the file
	while(inputStream.hasNextLine()) {
		s=inputStream.next();
		d=inputStream.nextDouble();
		cities.put(s, d);
		
	}
	outputStream.println(cities);
	
	//print Hashmap
	
	double val=0;
	String key = null;
	for(String c: cities.keySet()) {
		key =c;
		val= cities.get(key);
		sum=sum+val;
	}
	//end while loop
	System.out.println("The sum of the population is: "+ sum);
	
	//user city lookup
	Scanner input =new Scanner(System.in);
	
	String city_name="";
	double user_cityPop=0;
	
	while (!cities.containsKey(city_name)){
		System.out.println("Enter the city");
		city_name=input.nextLine();
		  if(cities.containsKey(city_name)) {
			  user_cityPop=cities.get(city_name);
			  System.out.println("City name "+city_name+" found");
		  }
	}
 System.out.println("the population of the city looked up is "+user_cityPop);

//create new hashMap with same cities, pop increased by 10%
   HashMap <String, Double> cities_new = new HashMap<String,Double>();
     
   	 
   	 cities_new.putAll(cities);
   	 
   	cities_new.replaceAll((key2, val2) -> val2*1.1);
   	 
   	System.out.println("after updating the values of cities by 10%");
   System.out.println("Philadelphia value is: "+ cities_new.get("Philadelphia"));
   System.out.println("Dallas value is: "+ cities_new.get("Dallas"));
   System.out.println("SanAntonio value is: "+ cities_new.get("SanAntonio"));
   
   
	inputStream.close();
	outputStream.close();
	}//end main
}//end class
