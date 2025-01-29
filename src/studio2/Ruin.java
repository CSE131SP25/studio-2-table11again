package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in); 
	 System.out.println("How much money are you starting with?");
	 double startAmount = in.nextDouble();
	 System.out.println("What is your win chance?");
	 double winChance = in.nextDouble();
	 System.out.println("What is your win limit?");
	 double winLimit = in.nextDouble();
	 
	 while (startAmount > 0 && startAmount < winLimit){
		 double number = Math.random();
		 if (number < winChance) {
		 	startAmount = startAmount + 1;
		 	System.out.println ("Won Money");
		 }
		 	else {
		 		startAmount = startAmount - 1;
		 		System.out.println ("lost money");
	 }
	 }
	if (startAmount >= winLimit)
		System.out.println("You can leave!");
	else {
		System.out.println("You lost everything");
	}
		

	

	}

}

