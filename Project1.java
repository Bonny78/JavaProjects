/*******************
Name: Mehjamila Bonny
Project 1
Date : September 18, 2020
*******************/
import java.util.Scanner;
public class Project1 {

     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
    int quantity1, quantity2, quantity3;
    double price1, price2, price3, subtotal, total1,total2, total3, totalTax,totalBill;
    final double salesTax= 0.0625;
    String item1, item2, item3;
    String heading1= "Item";
    String heading2= "Quantity";
    String heading3= "Price";
    String heading4= "Total";
    String heading5= "Subtotal";
    String heading6= "6.25% Tax";
    String heading7= "Total bill";

     // Item 1 input
     System.out.println("Enter the name of item1");
     item1= input.nextLine();
     System.out.println("Enter the quantity of item1");
     quantity1= input.nextInt();
     System.out.println("Enter the price of item1");
     price1= input.nextDouble();
     // Item 2 input 
     System.out.println("Enter the name of item2");
     String junk =input.nextLine();
     item2= input.nextLine();
     System.out.println("Enter the quantity of item2");
     quantity2= input.nextInt();
     System.out.println("Enter the price of item2");
     price2= input.nextDouble();
     // Item 3 input 
     System.out.println("Enter the name of item3");
     String trash =input.nextLine(); 
     item3= input.nextLine();
     System.out.println("Enter the quantity of item3");
     quantity3= input.nextInt();
     System.out.println("Enter the price of item3");
     price3= input.nextDouble();
     // Calculate Item 1 total
     total1 =price1*quantity1;
     total2 =price2*quantity2;// Calculate Item 2 total
     total3 =price3*quantity3;// Calculate Item 3 total
     subtotal = total1+total2+total3; // Subtotal
     totalTax = subtotal*salesTax;
     totalBill = subtotal +totalTax;
     
    System.out.println("\t\t\t\t THE BILL");
    System.out.printf("%-20s %-10s %-10s %-10s\n",heading1,heading2,heading3,heading4);
    System.out.printf("%-20s %-10d %-10.2f %5.2f\n", item1,quantity1,price1,total1 );
    System.out.printf("%-20s %-10d %-10.2f %5.2f\n", item2,quantity2,price2,total2);
    System.out.printf("%-20s %-10d %-10.2f %5.2f\n", item3,quantity3,price3,total3 );
    System.out.println();
    System.out.printf("%-20s %-10s %-10s %-10.2f\n",heading5,"         ", "         ", subtotal );
    System.out.printf("%-20s %-10s %-10s %-10.2f\n",heading6,"         ", "         ", totalTax );
    System.out.printf("%-20s %-10s %-10s %-10.2f\n",heading7,"         ", "         ", totalBill );     
    
/************* RESULTS
Enter the name of item1
 Chocolate Bar
 Enter the quantity of item1
 3
 Enter the price of item1
 1.2
 Enter the name of item2
 Bananas
 Enter the quantity of item2
 5
 Enter the price of item2
 0.45
 Enter the name of item3
 Sweet Potatoes
 Enter the quantity of item3
 3
 Enter the price of item3
 1.34
 				 THE BILL
 Item                 Quantity   Price      Total     
 Chocolate Bar        3          1.20        3.60
 Bananas              5          0.45        2.25
 Sweet Potatoes       3          1.34        4.02
 
 Subtotal                                   9.87      
 6.25% Tax                                  0.62      
 Total bill                                 10.49     
 
  ----jGRASP: operation complete.
*******************/   
          

     }}
     

     
     
