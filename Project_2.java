/** a program to assign passengers seats in a small airplane
Project 2
@author Mehjamila Bonny
@date February 19, 2021
**/
import java.util.Scanner;
public class Project_2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String[][] seats = {{"1","A","B","C","D"},{"2","A","B","C","D"},{"3","A","B","C","D"},{"4","A","B","C","D"},{"5","A","B","C","D"},{"6","A","B","C","D"},{"7","A","B","C","D"}};
		
		int totalSeat=28;
		int countSeat=0;
		printSeats(seats);
		boolean fill=false;
		
		while(countSeat<=28 && fill==false) {
			System.out.println("Enter the seat - like 1A/2B");
			String seatWanted=input.next();
			int r =findRow(seatWanted);
			int c= findColumn(seatWanted);
			if(seats[r][c]=="X")
			  System.out.println("Seat booked. Select another seat");
			else {
				seats[r][c]="X";
				countSeat++; 
			}
		
		printSeats(seats);
		      if(countSeat>=28)
		    	  fill=true;
		 
		}
		
	}//end main
/** method that prints the 2d array
 * @param a String of 2D array
 */
	public static void printSeats(String[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
			System.out.print(a[i][j] + " ");	
			}
			System.out.println();
		}
	}
	
/**Method that finds the row of the seat selected
 * @param a String
 * @return int
 */
	public static int findRow(String a) {
		char b =a.charAt(0);
		int row = b-'0';
		if(row ==1)
			return 0;
		else if(row==2)
			return 1;
		else if(row==3)
			return 2;
		else if(row==4)
			return 3;
		else if(row==5)
			return 4;
		else if(row==6)
			return 5;
		else if(row==7)
			return 6;
		else 
			return -1;
		
	}

/**Method that finds the colum of the seat selected
 * @param a String
 * @return int
 */
	public static int findColumn(String a) {
		char b =a.charAt(1);
		if(b=='A')
		   return 1;
		else if(b=='B')
			return 2;
		else if(b=='C')
			return 3;
		else if(b=='D')
			return 4;
		else 
			return -1;
	}
}//end class
/**********************
1 A B C D 
2 A B C D 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
1A
1 X B C D 
2 A B C D 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
1B
1 X X C D 
2 A B C D 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
1C
1 X X X D 
2 A B C D 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
1D
1 X X X X 
2 A B C D 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
2A
1 X X X X 
2 X B C D 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
2D
1 X X X X 
2 X B C X 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
2B
1 X X X X 
2 X X C X 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
2C
1 X X X X 
2 X X X X 
3 A B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
3A
1 X X X X 
2 X X X X 
3 X B C D 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
3D
1 X X X X 
2 X X X X 
3 X B C X 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
3B
1 X X X X 
2 X X X X 
3 X X C X 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
3C
1 X X X X 
2 X X X X 
3 X X X X 
4 A B C D 
5 A B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
5A
1 X X X X 
2 X X X X 
3 X X X X 
4 A B C D 
5 X B C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
5B
1 X X X X 
2 X X X X 
3 X X X X 
4 A B C D 
5 X X C D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
5C
1 X X X X 
2 X X X X 
3 X X X X 
4 A B C D 
5 X X X D 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
5D
1 X X X X 
2 X X X X 
3 X X X X 
4 A B C D 
5 X X X X 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
4D
1 X X X X 
2 X X X X 
3 X X X X 
4 A B C X 
5 X X X X 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
4B
1 X X X X 
2 X X X X 
3 X X X X 
4 A X C X 
5 X X X X 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
4C
1 X X X X 
2 X X X X 
3 X X X X 
4 A X X X 
5 X X X X 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
4A
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
4B
Seat booked. Select another seat
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 A B C D 
7 A B C D 
Enter the seat - like 1A/2B
6A
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X B C D 
7 A B C D 
Enter the seat - like 1A/2B
6B
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X C D 
7 A B C D 
Enter the seat - like 1A/2B
6C
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X X D 
7 A B C D 
Enter the seat - like 1A/2B
6D
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X X X 
7 A B C D 
Enter the seat - like 1A/2B
7A
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X X X 
7 X B C D 
Enter the seat - like 1A/2B
7B
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X X X 
7 X X C D 
Enter the seat - like 1A/2B
7C
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X X X 
7 X X X D 
Enter the seat - like 1A/2B
7D
1 X X X X 
2 X X X X 
3 X X X X 
4 X X X X 
5 X X X X 
6 X X X X 
7 X X X X 
******************/
