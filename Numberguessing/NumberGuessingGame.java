package numberguessing;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberGuessingGame {
	public int counter = 1;
	
	public static void main(String[] args) {
		Random r = new Random();
		int no = r.nextInt(100)+1;
		 NumberGuessingGame n =new NumberGuessingGame(no);
		
		
	}
	
	
	public void score(int no)
	{
		if(no == 1) {
			System.out.println("Congratulations...your score is 100");
			System.out.println("*************");
			tryagain(no);
			
		}
		else if((no >= 2) && (no <= 3)) {
			System.out.println("Congratulations...your score is 80");
			System.out.println("*************");
			tryagain(no);
	}
		else if((no >= 4) && (no <= 5)) {
			System.out.println("Congratulations...your score is 60");
			System.out.println("*************");
			tryagain(no);
	}
		else if((no >=6) && (no <= 7)) {
			System.out.println("Congratulations...your score is 40");
			System.out.println("*************");
			tryagain(no);
	}
		else if((no >= 8) && (no <= 9)) {
			System.out.println("Congratulations...your score is 20");
			System.out.println("*************");
			tryagain(no);
	}
		else if(no == 10) {
			System.out.println("Congratulations...your score is 10");
			System.out.println("*************");
			tryagain(no);
		
	}
	
	}
	public void tryagain(int no) {
		System.out.println("Do you wanna play..Again...!(Y/N)");
		Scanner s = new Scanner(System.in);
		char str = s.next().charAt(0);
		
		switch(str){
			case 'y' : new NumberGuessingGame(no);
			break;
			case 'Y' :  new NumberGuessingGame(no);
			break;
			case 'n' : 
				System.out.println("*************");
				System.out.println("Thank You....!");
			break;
			
			case 'N' :System.out.println("*************");
			System.out.println("Thank You....!");
			break;
			default :
				System.out.println("Invalid...Please Enter Y/N");
				char c = s.next().charAt(0);
				new NumberGuessingGame(no);
		}
		
	}
	
	public NumberGuessingGame(int no)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Guess a Number from 1 to 100 : ");
		int guess_value;
		try {
			do {
				guess_value = s.nextInt();
				if((guess_value <= 100) && (guess_value >= 1))
				{
				if(guess_value == no)
				{
					System.out.println("You got it in " + counter +" attempts...!");
					score(counter);
					
					
					System.exit(0);
				}
				else if(no > guess_value){
					System.out.println("Too Lowww...Try Again");
					counter++;
				}
				else if(no < guess_value){
					System.out.println("Too High...Try Again");
					counter++;
				}
				}
				
				else {
					System.out.println("You are Out of Range...Enter number between 1 to 100");
					 NumberGuessingGame n = new  NumberGuessingGame(no);
					
				}
				
				
			}while(true);
		}
		
		catch(InputMismatchException ex){
			System.out.println("Invalid Input....");
			 NumberGuessingGame n = new  NumberGuessingGame(no); //from here,the loop is strated again
			
		}
	}

}
