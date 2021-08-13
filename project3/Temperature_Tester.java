/*******************
Name: Mehjamila Bonny
Project 3 
Title: Temperature_Tester
Date : October 22, 2020
*******************/

public class Temperature_Tester {
   public static void main(String [] args) {
   
   Temperature t1 = new Temperature();
   Temperature t2 = new Temperature(83.5,'C');
   Temperature t3 = new Temperature(54.3);
   Temperature t4 = new Temperature ('F');
   
   t1.setValue(83.5);
   t1.setScale('C');
      
   t3.setScale('C');
   t4.setValue(22.6);
   
   System.out.println("The temperature of t3 is " + t3.getValue() + " degree " + t3.getScale());
   System.out.println("The temperature of t4 is " + t4.getValue() + " degree " + t4.getScale());
   
//test equal method
  if(t1.equals(t2))
    System.out.println("The temperature objects of t1 and t2 are equal");
  else 
    System.out.println("The temperature objects of t1 and t2 are not equal");
    
  if(t3.equals(t4))
    System.out.println("The temperature objects of t3 and t4 are equal");
  else 
    System.out.println("The temperature objects of t3 and t4 are not equal");

//Testing conversion rate  
  System.out.println(t1);
  System.out.printf("The temperature of t1 converts to %.1f %s", t1.getFarenheit(), "Farenheit");
  System.out.println();
  System.out.println(t2);
  System.out.printf("The temperature of t2 converts to %.1f %s", t2.getFarenheit(), "Farenheit");
  System.out.println();
  System.out.println(t1);
  System.out.printf("The temperature of t1 converts to %.1f %s", t1.getFarenheit(), "Farenheit");
  System.out.println();
  System.out.println(t3);
  System.out.printf("The temperature of t3 converts to %.1f %s", t3.getFarenheit(), "Farenheit");
  System.out.println();
  System.out.println(t4);
  System.out.printf("The temperature of t4 converts to %.1f %s", t4.getFarenheit(), "Farenheit");
  System.out.println();
  
/********** Results
The temperature of t3 is 54.3 degree C
 The temperature of t4 is 22.6 degree F
 The temperature objects of t1 and t2 are equal
 The temperature objects of t3 and t4 are not equal
 The temperature is 83.5 degrees C
 The temperature of t1 converts to 182.3 Farenheit
 The temperature is 83.5 degrees C
 The temperature of t2 converts to 182.3 Farenheit
 The temperature is 83.5 degrees C
 The temperature of t1 converts to 182.3 Farenheit
 The temperature is 54.3 degrees C
 The temperature of t3 converts to 129.7 Farenheit
 The temperature is 22.6 degrees F
 The temperature of t4 converts to 22.6 Farenheit
**************************************/
  
}//end method
 }//end class
