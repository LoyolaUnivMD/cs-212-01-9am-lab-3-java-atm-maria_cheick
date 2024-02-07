// Programmers:  Cheick and Maria
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: 3
// Problem Statement: Create an ATM
// Data In: deposit/withdraw amounts, name, choices
// Data Out: balance, total deposit/withdraw amounts, exit message
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

//Imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab3
{
	public static void main(String[] args) {
	    //Create Scanner object
	    Scanner reader = new Scanner(System.in);

	    // Create DecimalFormat object
	    DecimalFormat money = new DecimalFormat("$,###.##");

	    //Initialize balance, totalDeposit, and totalWithdraw
	    double balance = 212.90, totalDeposit = 0, totalWithdraw = 0;
	   
	        //Ask use for name
		System.out.println("Welcome to Cheick and Maria's Bank! What is your name? ");
		//Store input in variable
		String username = reader.next();

		//Ask user what they want to do
		System.out.println("Hi " + username + "! What would you like to do today? Type a letter to make your selection. ");
		System.out.println("\nD: Deposit\n W: Withdraw\n B: Check balance\n Q: Leave");
		//Store choice in variable
		String choice = reader.next();
		//Strip choice of whitespace and convert to uppercase
		choice = choice.strip().toUpperCase();

		//Continue to loop until the user enters "Q" to quit
		while(!choice.equals("Q")){
		    //If the user entered D
		    if(choice.equals("D")){
			//Ask user for amount to deposit
		        System.out.println("How much would you like to deposit? ");
			//Store input in variable
		        double depositAmt = reader.nextDouble();
			//increment balance by the deposit amount
		        balance += depositAmt;
			//Increment total deposit by deposit amount
		        totalDeposit += depositAmt;
		        //Output user's balance
		        System.out.println("Your current balance is " + money.format(balance));
		    }
		    // If the user entered W
		    else if (choice.equals("W")){
			//Ask user for amount to be withdrawn
		        System.out.println("How much would you like to withdraw? ");
			//Assign user input to variable
		        double withdrawAmt = reader.nextDouble();
			    //If the number the user entered is greater than their balance
		            if(withdrawAmt > balance){
				//Notify the user
		                System.out.println("Your amount has exceeded your funds.");
				//Does not change the balance
		            }
			    //If the number the user entered is less than or equal to their balance
		            else{
			    // Decrement the balance by withdraw amount
		            balance-= withdrawAmt;
			    //Increment the total withdraw amount by the withdraw amount
		            totalWithdraw += withdrawAmt;
		            }
			//Output the user's balance
		        System.out.println("Your current balance is " + money.format(balance));
		    }
		    //If the user entered B
		    else if(choice.equals("B")){
			//Output the user's balance
		        System.out.println("Your current balance is " + money.format(balance));
		    }
		    // If the user entered an invalid option
		    else{
		        System.out.println("Invalid input.");
		    }
		    //Ask the user to choose and action
		    System.out.println("Type a letter to make your selection. \nD: Deposit\n W: Withdraw\n B: Check balance\n Q: Leave");
		    choice = reader.next();
		    choice = choice.strip().toUpperCase();
		}
		//Asks the user how they want their receipt
		System.out.println("Would like your receipt printed or emailed? Type a letter to choose.");
		System.out.println("P: Printed\nE: Emailed");
		//Store user input in variable
		String receipt = reader.next();
		//Strip whitespace and convert to upper case
		receipt = receipt.strip().toUpperCase();

		//Output total amount deposited, total amount withdrawn, balance, and thank you message
		System.out.println("-------------------------------");
		System.out.println("Deposit: " + money.format(totalDeposit));
		System.out.println("Withdraw: " + money.format(totalWithdraw));
		System.out.println("Balance: " + money.format(balance));
		System.out.println("Thank you " + username + "!");
		System.out.println("-------------------------------");

		//If the user entered P
		if(receipt.equals("P")){
		    // Remind the user to take their receipt
		    System.out.println("Don't forget your receipt!");
		}
		//If the user entered E
		else{
		    //Remind the user to check their email to see their receipt
		    System.out.println("Check your email for your receipt!");
		}
		}
		
		
	}


