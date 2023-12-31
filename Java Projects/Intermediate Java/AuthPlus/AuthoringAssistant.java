/**

 *  Learn to use the extend keyword
 *  CS108-1
 *  06 June 2021
 *  @author  Rita Herfi
  */


import java.util.Scanner;

public class AuthoringAssistant {
   
   protected String usrStr; //changed from private to protected so it could be used by the Plus class
	
   public int getNumOfNonWSCharacters() {
      int count;
      int i;
      
      count = 0;
      
      for (i = 0; i < usrStr.length(); ++i) {
         if ( Character.isWhitespace(usrStr.charAt(i)) == false) {
            ++count;
         }
      }
      
      return count;
   }

   public int getNumOfWords() {
      int count;
      int i;
      
      count = 0;
      
      for (i = 1; i < usrStr.length(); ++i) {
         if ( (Character.isWhitespace(usrStr.charAt(i)) == true) && 
              (Character.isWhitespace(usrStr.charAt(i - 1))) == false) {
            ++count;
         }
      }
      
      if (Character.isWhitespace(usrStr.charAt(i - 1)) == false) {
         ++count;
      }
      
      return count;
      
   }

   
   public int findText(final String toFind) {
	   int count;
	      int where;
	            
	      count = 0;
	      
	      do {
	         where = usrStr.indexOf(toFind);
	         
	         if (where == -1) {
	            return count;
	         }
	         
	         count++;
	         usrStr = usrStr.substring(where + 1, usrStr.length());

	      } while (where != - 1);
	      
	      return count;

   }
   
   public String replaceExclamation() {
      return usrStr.replace('!', '.');
   }
   
   public String shortenSpace() {
      // Check for occurrences of two spaces
      while (usrStr.indexOf("  ") != -1) {
         // Replace two spaces with a single space
         usrStr = usrStr.replace("  ", " ");
      }
      
      return usrStr;
   }
   
   public char printMenu(Scanner scnr) {
      char menuOp;
      
      System.out.println("\nMENU");
      System.out.println( "c - Number of non-whitespace characters");
      System.out.println("w - Number of words");
      System.out.println("f - Find text");
      System.out.println("r - Replace all !\'s");
      System.out.println( "s - Shorten spaces");
      System.out.println("i - Indent");
      System.out.println("x = Find and replace words");
      System.out.println("q - Quit\n");
      
      menuOp = ' ';
      
      while (menuOp != 'c' && menuOp != 'w' && menuOp != 'f' &&
                menuOp != 'r' && menuOp != 's' && menuOp != 'o' && menuOp != 'i' && menuOp != 'x' &&
                menuOp != 'q') {
         System.out.println( "Choose an option:");
         menuOp = scnr.next().charAt(0);
      }
      
      return menuOp;
   }
   
   public void setInputString(String s) {
	   this.usrStr = s; 
   }
   
}
