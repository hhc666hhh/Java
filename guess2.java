package week2;

import java.util.Scanner;

public class guess2 {
	public static void main(String[]args){
	int randomNumber;
	int guessNumber;
	boolean success=false;
	int times=0;
	randomNumber=(int)(Math.random()*1000);
	System.out.println(randomNumber);
	System.out.println("I have a number between 1 and 1000.");
	System.out.println("Can you guess my number?");
	System.out.println("Please type your first number.");
	Scanner scan=new Scanner(System.in );
	while(!success)
	{
		guessNumber=scan.nextInt();
		if(guessNumber==randomNumber) 
		{
			System.out.println("Good,you guess right!");
			success=true;
		}
		else
		{
			if(guessNumber<randomNumber) {
				System.out.println("Too small.Try again!");
			}
			else {
				System.out.println("Too big.Try again!");	
			}
		}
		times++;
	}
	if(success)
	{
		System.out.println("¹²²Â²â"+times+"´Î");
	}
	scan.close();
}
}
