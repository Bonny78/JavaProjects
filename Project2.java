/*******************
Name: Mehjamila Bonny
Project 2 
Title: The Game of Nims
Date : October 12, 2020
*******************/
import java.util.Scanner;
public class Project2 {

    public static void main(String [] args) {
    Scanner input= new Scanner(System.in);
    int total = 100, max_stones = 5, num_stones_removed;
    int pile = total; //all stones are in the pile to start
    boolean won= false;
    boolean player2=false;
    boolean player1=false;
    
  while (pile>0 && won==false) {
    
     while (player1==false){
        System.out.println("Player1- How many stones you want to remove between 1 and " + max_stones);
        num_stones_removed= input.nextInt();
        System.out.print(num_stones_removed);
    
    if (num_stones_removed>=1 && num_stones_removed<=max_stones  &&  num_stones_removed<=pile) {
      pile =pile-num_stones_removed; //update pile
          player1=true;
      System.out.println("You have " + pile + " stones left");
      
          if (pile==0) {
              won=true;
            System.out.println("Congratulations! Player1 won");
              System.exit(0);           // ends when player1 wins
          }
    }     else {
            System.out.println("Invalid pick");
            continue; }// end else
 } 
    player1=false;    
      while (player2==false) {    
         System.out.println("Player2- How many stones you want to remove between 1 and " + max_stones);
         num_stones_removed= input.nextInt();
    
        if (num_stones_removed>=1 && num_stones_removed<=max_stones  && num_stones_removed<=pile) {
      
            pile =pile-num_stones_removed; //update pile
            player2=true;
            System.out.println("You have " + pile + " stones left");
      
          if (pile==0) {
             won=true;
           System.out.println("Congratulations! Player2 won"); // player 2 wins
             break;
          }
      } else {
      System.out.println("Invalid pick");
      continue; }// end else
     }
      
       player2=false;
 
}// while loop
}}
/*********** RESULTS with total 15 stones
----jGRASP exec: java Project2
 Player1- How many stones you want to remove between 1 and 5
 3
 3You have 97 stones left
 Player2- How many stones you want to remove between 1 and 5
 5
 You have 92 stones left
 Player1- How many stones you want to remove between 1 and 5
 2
 2You have 90 stones left
 Player2- How many stones you want to remove between 1 and 5
 5
 You have 85 stones left
 Player1- How many stones you want to remove between 1 and 5
 7
 7Invalid pick
 Player1- How many stones you want to remove between 1 and 5
 5
 5You have 80 stones left
 Player2- How many stones you want to remove between 1 and 5
 5
 You have 75 stones left
 Player1- How many stones you want to remove between 1 and 5
 3
 3You have 72 stones left
 Player2- How many stones you want to remove between 1 and 5
 5
 You have 67 stones left
 Player1- How many stones you want to remove between 1 and 5
 5
 You have 62 stones left
 Player2- How many stones you want to remove between 1 and 5
 2
 You have 60 stones left
 Player1- How many stones you want to remove between 1 and 5
 5
 You have 55 stones left
 Player2- How many stones you want to remove between 1 and 5
 62
 Invalid pick
 Player2- How many stones you want to remove between 1 and 5
 4
 You have 51 stones left
 Player1- How many stones you want to remove between 1 and 5
 5
 You have 46 stones left
 Player2- How many stones you want to remove between 1 and 5
 3
 You have 43 stones left
 Player1- How many stones you want to remove between 1 and 5
 2
 You have 41 stones left
 Player2- How many stones you want to remove between 1 and 5
 4
 You have 37 stones left
 Player1- How many stones you want to remove between 1 and 5
 7
 Invalid pick
 Player1- How many stones you want to remove between 1 and 5
 8
 8Invalid pick
 Player1- How many stones you want to remove between 1 and 5
 2
 2You have 35 stones left
 Player2- How many stones you want to remove between 1 and 5
 2
 You have 33 stones left
 Player1- How many stones you want to remove between 1 and 5
 2
 2You have 31 stones left
 Player2- How many stones you want to remove between 1 and 5
 4
 You have 27 stones left
 Player1- How many stones you want to remove between 1 and 5
 5
 5You have 22 stones left
 Player2- How many stones you want to remove between 1 and 5
 3
 You have 19 stones left
 Player1- How many stones you want to remove between 1 and 5
 5
 5You have 14 stones left
 Player2- How many stones you want to remove between 1 and 5
 7
 Invalid pick
 Player2- How many stones you want to remove between 1 and 5
 3
 You have 11 stones left
 Player1- How many stones you want to remove between 1 and 5
 5
 5You have 6 stones left
 Player2- How many stones you want to remove between 1 and 5
 5
 You have 1 stones left
 Player1- How many stones you want to remove between 1 and 5
 1
 You have 0 stones left
 Congratulations! Player1 won
 
  ----jGRASP: operation complete.
 *************************************************/

    

