/*******************
Name: Mehjamila Bonny
Project 4
Title: You have Got Shoes
Date : November 15, 2020
*******************/

import java.util.Scanner;
public class YouHaveGotShoes {

 public static void main(String [] args) {
 Scanner input = new Scanner(System.in);

   Shoe s1= new Shoe("Sofft","Madeline",50, 833051,40);
   Shoe s2 = new Shoe("Donald J Pliner","Tiki", 100, 325189,40);
   Shoe s3 =new Shoe("Steve Madden", "Realove", 40, 389004, 40);
   
 //input price for 4th shoe
   System.out.println("Enter the price for the fourth shoe");
   double price_4thshoe = input.nextDouble();
   
//using other constructor
   Shoe s4 = new Shoe("Payless", "Maryjenius",price_4thshoe,400370);
   
//info before changes
 System.out.println("Shoe info before changes");
 System.out.println("-----------------------------");
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 System.out.println(s4);
 
//Changes to shoe objects 
 s4.like(); 
 s3.like(5); 
 s2.like(-1);
 s1.setPrice(29.99);
 
 //decrease price of 2,3,4 shoe
    double discount = 0.2;
    double newPrice_s2=(s2.getPrice()-(s2.getPrice()*discount));
    s2.setPrice(newPrice_s2);
    double newPrice_s3=(s3.getPrice()-(s3.getPrice()*discount));
    s3.setPrice(newPrice_s3);
    double newPrice_s4=(s4.getPrice()-(s4.getPrice()*discount));
    s4.setPrice(newPrice_s4);


//Shoe info after changes
    System.out.println("Shoe info after changes");
    System.out.println("-----------------------------");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
 
 //Calculate total price and average likes;
 double totalPrice =s1.getPrice()+s2.getPrice()+s3.getPrice()+s4.getPrice();
 double avg_likes= (double)(s1.getLikes()+s2.getLikes()+s3.getLikes()+s4.getLikes())/4;
 
    System.out.println("Summary \n" + "----------");
    System.out.printf("Total Price of shoes: %s%.2f","$",totalPrice);
    System.out.println();
    System.out.println("Average number of likes: " + avg_likes);
 }//end main
}//end class

/************* 
  ----jGRASP exec: java YouHaveGotShoes
 Enter the price for the fourth shoe
 59.99
 Shoe info before changes
 -----------------------------
 Manufacturer: Sofft, Name: Madeline, SKU: 833051, Price: $50.0, Number of likes: 40
 Manufacturer: Donald J Pliner, Name: Tiki, SKU: 325189, Price: $100.0, Number of likes: 40
 Manufacturer: Steve Madden, Name: Realove, SKU: 389004, Price: $40.0, Number of likes: 40
 Manufacturer: Payless, Name: Maryjenius, SKU: 400370, Price: $59.99, Number of likes: 0
 Shoe info after changes
 -----------------------------
 Manufacturer: Sofft, Name: Madeline, SKU: 833051, Price: $29.99, Number of likes: 40
 Manufacturer: Donald J Pliner, Name: Tiki, SKU: 325189, Price: $80.0, Number of likes: 39
 Manufacturer: Steve Madden, Name: Realove, SKU: 389004, Price: $32.0, Number of likes: 45
 Manufacturer: Payless, Name: Maryjenius, SKU: 400370, Price: $47.992000000000004, Number of likes: 1
 Summary 
 ----------
 Total Price of shoes: $189.98
 Average number of likes: 31.25
 
  ----jGRASP: operation complete.
     ****************************************************/