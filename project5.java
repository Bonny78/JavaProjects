/*******************
Name: Mehjamila Bonny
Project 5
Title: The sport of diving
Date : November 23, 2020
*******************/

/** Project 5 inputs the degree of difficulty and the the 7 judges scores 
and output the overall score for that dives
@version1
@since 2020-11-23
**/

import java.util.Scanner;
public class project5 {
   public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   int [] num_Judges = new int[7];
   float [] score =new float[7];

//Valid difficulty degree  
   System.out.println("Enter the degree of difficulty for the dive (1.2-3.8)");
   float degree= input.nextFloat();
    while(degree<1.2 || degree>3.8){
       System.out.println("Incorrect entry. Enter valid the degree of difficulty for the dive (1.2-3.8)");
       degree= input.nextFloat();
    }
    
//Judges entering score
  for(int i=0;i<num_Judges.length;i++) {
     System.out.println("Enter the score for judge " + (i+1) +" (0-10)");
     score[i] =input.nextFloat();
     while(score[i]<0 || score[i]>10){
      System.out.println("Incorrect. Enter the score for judge " + (i+1) + " (0-10)");
      score[i] =input.nextFloat();
     }
  }

//calculate final score
  double totalScore= (sumScore(score)-minScore(score)-maxScore(score))*degree;
  double finalScore= totalScore*0.60;
  System.out.println("the diver's final score is :" + finalScore);
  
  
 }//end main
 
/******************************************
Method that computes maximum value of score array
@param a array of scores
@return max score
*******************************************/
public static float maxScore(float [] a){
  float max=a[0];
   for(int i=0;i<a.length;i++){
      if(a[i]>max)
       max=a[i];
   }
 return max;
}//end method

/************************************************
Method that computes minimum value of score array
@param a array of scores
@return minimum score
*************************************************/

public static float minScore(float [] a){
   float min=a[0];
      for(int i=0;i<a.length;i++){
         if(a[i]<min)
            min=a[i];
   }
 return min;
}//end method

/*******************************
Method to calculate sumof scores
@param a array of scores
@return sum of scores
*********************************/
public static float sumScore(float[] a){
  float sum=0;
   for(int i=0;i<a.length;i++){
     sum = sum+a[i];
   }
 return sum;
}//end method

}//end class

/********** RUN 1
----jGRASP exec: java project5
 Enter the degree of difficulty for the dive (1.2-3.8)
 1.6
 Enter the score for judge 1 (0-10)
 5
 Enter the score for judge 2 (0-10)
 5
 Enter the score for judge 3 (0-10)
 7
 Enter the score for judge 4 (0-10)
 6
 Enter the score for judge 5 (0-10)
 8
 Enter the score for judge 6 (0-10)
 4
 Enter the score for judge 7 (0-10)
 9
 the diver's final score is :29.760001373291015
 
 
 RUN 2
  ----jGRASP exec: java project5
 Enter the degree of difficulty for the dive (1.2-3.8)
 3.2
 Enter the score for judge 1 (0-10)
 4
 Enter the score for judge 2 (0-10)
 5.6
 Enter the score for judge 3 (0-10)
 7.8
 Enter the score for judge 4 (0-10)
 9.8
 Enter the score for judge 5 (0-10)
 3.4
 Enter the score for judge 6 (0-10)
 6.7
 Enter the score for judge 7 (0-10)
 5.6
 the diver's final score is :57.02399597167969
 
  ----jGRASP: operation complete.
 
 
****************************/ 
