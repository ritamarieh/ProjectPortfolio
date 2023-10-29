import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TicketingService {

   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      String personName = "";
      int counter = 0;
      int youPosition = 0;

      Queue<String> peopleInQueue = new LinkedList<String>();
      
      personName = scnr.nextLine();
      while (!personName.equals("-1")) {
         // TODO: Add personName to peopleInQueue and 
         //       determine position of "You" (youPosition)                                              
       peopleInQueue.add(personName);
        counter++; //add to counter
         if(personName.equals("You")){ //whenever it says you that is your position
          youPosition = counter;  
         }
      
         personName = scnr.nextLine();
      }

      System.out.println("Welcome to the ticketing service... ");
      System.out.println("You are number " + youPosition + " in the queue.");

      // TODO: In a loop, remove head person from peopleInQueue,                                    
      //       output their name and that they have purchased a ticket,                             
      //       then output your position in the queue. When you are at                              
      //       the head, output that you can purchase your ticket.                                  
      for(int i = youPosition-1; i > 0;--i){
          System.out.println(peopleInQueue.remove() + " has purchased a ticket."); //remove() returns the first in element and deletes it after
         
          System.out.println("You are now number " + i);
      }
      System.out.println("You can now purchase your ticket!"); //took it out of the loop since it can't handle 0

   }
}
