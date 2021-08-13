/*******************
Name: Mehjamila Bonny
Project 3
Title: Temperature
Date : October 22, 2020
*******************/
public class Temperature {

//instance variables 
  private double value;
  private char scale;

//fully qualified constructor
  public Temperature(double v,char s) {
    value = v;
    scale = s;
  }
  
//default constructor
  public Temperature() {
   value = 0;
   scale = 'C';
  } 
//constructor parameter for temp
  public Temperature(double v) {
    value= v;
    scale ='C';
  }
//constructors parameter for scale
  public Temperature(char s) {
   value=0;
   this.scale = s;
  }
    
  
//getters
  public double getValue() {
    return value;
  }
  public char getScale() {
    return scale;
  }
//setters
  public void setValue(double v) {
    value = v;
  }
  public void setScale(char s) {
    scale = s;
  }
//toString 
  public String toString() {
    return "The temperature is " + value + " degrees " + scale;
  }

//conversion
  public double getFarenheit() {
  
  if (scale=='C')
    return 9*(value/5.0) +32;
  else 
     return value;
  }
// equal method
  public boolean equals(Temperature other) {
    if ((this.value==other.value) && (this.scale==other.scale))
       return true;
    else 
       return false;
  }  
}// end class