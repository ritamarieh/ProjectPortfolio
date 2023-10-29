/**
 *  Program 3b
 *  Learn to use the extend keyword
 *  CS108-1
 *  06 June 2021
 *  @author  Rita Herfi
  */
import java.util.Scanner;

public class AuthDriver {
	 public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	     // AuthoringAssistant auth = new AuthoringAssistant();
	      AuthoringAssistantPlus auth = new AuthoringAssistantPlus();
	      String inputString;
	      char menuChoice;
	      String toFind;
	      int spaceIndent;
	      String find;
	      String replace;
	      
	      
	      // Get string from user
	      System.out.println("Enter a sample text:");
	      inputString = scnr.nextLine();
	      
	      System.out.println("\nYou entered: " + inputString);
	      
	      auth.setInputString(inputString);
	      
	      menuChoice = ' ';
	      // Execute menu command
	      while (menuChoice != 'q') {
	         menuChoice = auth.printMenu(scnr);
	         
	         if (menuChoice == 'c') {
	            System.out.println("Number of non-whitespace characters: " + auth.getNumOfNonWSCharacters());
	             menuChoice = ' ';
	         }
	         
	         else if (menuChoice == 'w') {
	            System.out.println("Number of words: " + auth.getNumOfWords());
	             menuChoice = ' ';
	         }
	         
	         else if (menuChoice == 'f') {
	             System.out.println( "Enter a word or phrase to be found:");
	             toFind = scnr.nextLine();
	             System.out.println("\"" + toFind + "\"" + " instances: " + auth.findText(toFind));
	              menuChoice = ' ';
	          }

	      
	         else if (menuChoice == 'r') {
	            inputString = auth.replaceExclamation();
	            System.out.println("Edited text: " + inputString);
	             menuChoice = ' ';
	         }
	      
	         else if (menuChoice == 's') {
	            inputString = auth.shortenSpace();
	            System.out.println("Edited text: " + inputString);
	             menuChoice = ' ';
	         }
	         else if (menuChoice == 'i') {
	        	 System.out.println("Enter the number of spaces to indent:");
	        	 spaceIndent = scnr.nextInt();
	        	 inputString = auth.indent(spaceIndent);
	        	 System.out.println("Edited text: " + inputString);
	        	  menuChoice = ' ';
	         }
	         else if (menuChoice == 'x') {
	        	 System.out.println("Enter a word to be found:");
	        	 find = scnr.next();
	        	 System.out.print("Enter a word to replace: ");
	        	 replace = scnr.next();
	        	 System.out.println(find); 
	        	 
	        	 inputString = auth.findAndReplace(find, replace);
	        	 System.out.println("Edited text: " + inputString);
	        	 
	        	  menuChoice = ' ';
	        	  
	         }
	      }
	   }
}
