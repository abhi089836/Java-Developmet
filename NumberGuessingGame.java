import java.util.Scanner;
class NumberGuessingGame {
public static void main(String[] args){
guessingNumberGame();
 }
 public static void guessingNumberGame(){
 Scanner sc= new Scanner(System.in);
 int computerNumber= (0+(int)(Math.random()*100));
 int MaxAttempt=5;
 int attempts=0;
 System.out.println("Let's Play the Game");
 System.out.println("You can Choose your number between 0 to 100");
 System.out.println("You have only " +MaxAttempt+ " Attempts");
 
 while(attempts<MaxAttempt) 
 {
  System.out.println("Guess the number: ");
  int userGuess=sc.nextInt();
  {
	  if(userGuess==computerNumber)
  {
   System.out.println("Congratulations! Your guessed number is correct");
  }else if(userGuess<computerNumber)
   {
    System.out.println("Your number " +userGuess + " is lesser than computerNumber " +computerNumber);
	}
	else {
	System.out.println("Your number " +userGuess + " is greater than computerNumber" +computerNumber);
	}
	attempts++;
	}
	if(attempts==MaxAttempt){
	System.out.println("You have reached your "+MaxAttempt+"Attempts");
	System.out.println("The number was "+computerNumber);
    }
   }
  }
	
}