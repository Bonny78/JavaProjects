/**
 * Lab 10
 * Matlib
 * Part 2
 * @author jbonn
 *@date April 29,2021
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matlib {
	public static void main(String[] args) throws IOException{
		
		//declaring input and output
		Scanner input=new Scanner(System.in);
        BufferedReader inputStream=null;
        FileWriter fw=null;
				
			try {
				inputStream=new BufferedReader(new FileReader("Tarzan.txt"));  
				fw = new FileWriter("output.txt");
	            Pattern pattern = Pattern.compile("<[a-zA-Z]*>");
	            String s=inputStream.readLine();
	            String outputString = new String(s);
	            
	          while (s!=null) {
	             Matcher matcher = pattern.matcher(s);

	                while(matcher.find()) {
	                    int startIndex = matcher.start();
	                    int endIndex = matcher.end();
	                    System.out.println("Please type a/an "+s.substring(startIndex+1, endIndex-1)+":");
	                    String inputWord = input.nextLine();
	                    outputString = outputString.replaceFirst("<[a-zA-Z]*>", inputWord);   
	                }//end inner while
	                fw.write(outputString);
	                s = inputStream.readLine();
	                outputString = s != null ? new String(s) : null;
	   } //end outer while  
	}//try end
			catch (FileNotFoundException e) {
	            System.out.println("Problem opening file");
	            System.exit(0);
	            }

	       catch(IOException e) {
	           System.out.println("error readind from original text");
	       }

	            input.close();
	            inputStream.close();
	            fw.close();
 }//end main
}//end class

/**
Please type a/an adjective:
happy
Please type a/an pluralNoun:
roosters
Please type a/an noun:
dog
Please type a/an adjective:
green
Please type a/an place:
Texas
Please type a/an pluralNoun:
cookies 
Please type a/an noun:
senator
Please type a/an funnyNoise:
burp
Please type a/an adjective:
silly
Please type a/an noun:
raisen
Please type a/an adjective:
old
Please type a/an pluralNoun:
cats
Please type a/an personName:
Tom
*********/