/*******************
Name: Mehjamila Bonny
Project 4
Title: Shoe Class
Date : November 15, 2020
*******************/

public class Shoe {
   private String manufacturer;
   private String name;
   private double price;
   private int SKU;
   private int likes;
   
 public Shoe(String m, String n, double p, int sku, int num_like) {
   manufacturer = m;
   name = n; 
   price = p;
   SKU = sku;
   likes = num_like;
 }
 
 public Shoe(String m, String n, double p, int sku) {
   manufacturer = m;
   name = n; 
   price = p;
   SKU = sku;
   likes = 0;
 }

   public String toString() {
     String s;
       s= "Manufacturer: "+ manufacturer + ", "+ "Name: "+ name + ", "+ "SKU: " + SKU + ", ";
       s= s + "Price: $" + price +", " + "Number of likes: " + likes;
    return s;
   }
   
//Mutators
  public void setManufacturer (String m) {
    manufacturer = m;
  }
  public void setName(String n) {
    name = n;
  }
  public void setSku(int sku) {
    SKU = sku;
  }
  public void setPrice(double p) {
    price = p;
  }
  public void setLike(int num_likes) {
    likes = num_likes;
  }

//Accessors
  public String getManufacturer() {
    return manufacturer;
  }
  public String getName() {
    return name;
  }
  public double getPrice() {
    return price;
  }
  public int getSku() {
    return SKU;
  }
  public int getLikes() {
    return likes;
  }

  
/** like method kind of mutator
@param none
@return void
****/
  public void like() {
    this.likes++;
  }
  
/**** like method adjusts the number of "likes"
@param a one integer
@return void
****************/
  public void like(int a) { 
    likes=likes + a;
  }


}//end class