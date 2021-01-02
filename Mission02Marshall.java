import java.util.Scanner;

//this program will calculate how much time will be saved by speeding 

public class Mission02Marshall
{

   public static void main(String[] args)
   {
      String destination; //declares as string
      double numMiles; //declares a double
      double speedLimit; //declares a double
      double mphOver; //declares a double
      double minutes; //declares a double
      double totalTime; //declares a double
      double newTotalTime; //declares a double
      double newMinutes; //declares a double
      double timeSaved; //declares a double
      double newSpeed; //declares a double
      
      Scanner keyboard = new Scanner(System.in); //initializes scanner
      
      System.out.print("Where do you want to travel? "); //asks user for input
      destination = keyboard.nextLine(); //reads user input
      
      System.out.print("How many miles to the destination? "); //asks user for input
      numMiles = keyboard.nextDouble(); //reads user input
      
      System.out.print("What is the speed limit? "); //asks user for input
      speedLimit = keyboard.nextDouble(); //reads user input
      
      System.out.print("How many mph over the speed limit do you wish to drive? "); //asks user for input
      mphOver = keyboard.nextDouble(); //reads user input
      
      totalTime = numMiles / speedLimit; //calculates how many hours
      minutes = totalTime * 60; //calculates how many minutes
      
      newSpeed = mphOver + speedLimit; //calculates new speed limit
      newTotalTime = numMiles / newSpeed; //calculates how many hours new mph
      newMinutes = newTotalTime * 60; //calculates how many minutes with new mph
      
      timeSaved = minutes - newMinutes; //calculates how much time is saved
      
      System.out.print("You will arrive in " + destination + " " + timeSaved + " minutes faster by going " 
                                 + mphOver + " the speed limit."); //what user sees after calculations have been done
      
  }
  
}      
      
      
      
      