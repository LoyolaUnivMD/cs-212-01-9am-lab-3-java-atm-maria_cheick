// Programmers:  Cheick and Maria
// Course:  CS 212
// Due Date: 2/11/24
// Lab Assignment: 3
// Problem Statement: Create an ATM
// Data In: deposit/withdraw amounts, name, choices
// Data Out: balance, total deposit/withdraw amounts, exit message
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person


import java.util.Scanner;
import java.text.DecimalFormat;

class Lab3
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    DecimalFormat money = new DecimalFormat("$,###.##");
	    

	    double balance = 212.90, totalDeposit = 0, totalWithdraw = 0;
	   
	    
		System.out.println("Welcome to Cheick and Maria's Bank! What is your name? ");
		String username = reader.next();
		
		System.out.println("Hi " + username + "! What would you like to do today? Type a letter to make your selection. ");
		System.out.println("\nD: Deposit\n W: Withdraw\n B: Check balance\n Q: Leave");
		String choice = reader.next();
		choice = choice.strip().toUpperCase();
		
		while(!choice.equals("Q")){
		    if(choice.equals("D")){
		        System.out.println("How much would you like to deposit? ");
		        double depositAmt = reader.nextDouble();
		        balance += depositAmt;
		        totalDeposit += depositAmt;
		        
		        System.out.println("Your current balance is " + money.format(balance));
		    }else if (choice.equals("W")){
		        System.out.println("How much would you like to withdraw? ");
		        double withdrawAmt = reader.nextDouble();
		            if(withdrawAmt > balance){
		                System.out.println("Your amount has exceeded your funds.");
	
		            }
		            else{
		            balance-= withdrawAmt;
		            totalWithdraw += withdrawAmt;
		            }
		        System.out.println("Your current balance is " + money.format(balance));
		    }
		    else if(choice.equals("B")){
		        System.out.println("Your current balance is " + money.format(balance));
		    }
		    else{
		        System.out.println("Invalid input.");
		    }
		    System.out.println("Type a letter to make your selection. \nD: Deposit\n W: Withdraw\n B: Check balance\n Q: Leave");
		    choice = reader.next();
		    choice = choice.strip().toUpperCase();
		}
		System.out.println("Would like your receipt printed or emailed? Type a letter to choose.");
		System.out.println("P: Printed\nE: Emailed");
		String receipt = reader.next();
		receipt = receipt.strip().toUpperCase();
		
		System.out.println("-------------------------------");
		System.out.println("Deposit: " + money.format(totalDeposit));
		System.out.println("Withdraw: " + money.format(totalWithdraw));
		System.out.println("Balance: " + money.format(balance));
		System.out.println("Thank you " + username + "!");
		System.out.println("-------------------------------");
		
		if(receipt.equals("P")){
		    System.out.println("Don't forget your receipt!");
		}
		else{
		    System.out.println("Check your email for your receipt!");
		}
		}
		
		
	}


