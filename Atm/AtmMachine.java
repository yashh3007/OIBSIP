package Atm;
import java.util.Scanner;

public class AtmMachine {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int userId = 609668;
	        int userPin = 8962;
	        boolean isLoggedIn = false;
	        Account userAccount = null;

	        System.out.println("Welcome to the ATM System!");
	        System.out.println("UserID:609668");
	        System.out.println("PIN:8962");
	        System.out.println("Opening Balance is 1000rs");
	        while (true) {
	            if (!isLoggedIn) {
	                System.out.print("Enter User ID: ");
	                int inputId = scanner.nextInt();
	                System.out.print("Enter PIN: ");
	                int inputPin = scanner.nextInt();

	                if (inputId == userId && inputPin == userPin) {
	                    isLoggedIn = true;
	                    userAccount = new Account(inputId, 1000);
	                    System.out.println("Login successful!");
	                } else {
	                    System.out.println("Invalid User ID or PIN. Try again.");
	                }
	            } else {
	                System.out.println("\nATM Menu:");
	                System.out.println("1. Transaction History");
	                System.out.println("2. Withdraw");
	                System.out.println("3. Deposit");
	                System.out.println("4. Transfer");
	                System.out.println("5. Quit");
	                System.out.print("Enter your choice: ");
	                int choice = scanner.nextInt();

	                switch (choice) {
	                    case 1:
	                        System.out.println("Transaction History:\n" + userAccount.getTransactionHistory());
	                        break;
	                    case 2:
	                        System.out.print("Enter withdrawal amount: ");
	                        int withdrawAmount = scanner.nextInt();
	                        userAccount.withdraw(withdrawAmount);
	                        break;
	                    case 3:
	                        System.out.print("Enter deposit amount: ");
	                        int depositAmount = scanner.nextInt();
	                        userAccount.deposit(depositAmount);
	                        break;
	                    case 4:
	                        System.out.print("Enter recipient's account number: ");
	                        int recipientAccountNumber = scanner.nextInt();
	                        System.out.print("Enter transfer amount: ");
	                        int transferAmount = scanner.nextInt();
	                        Account recipientAccount = new Account(recipientAccountNumber, 0);
	                        userAccount.transfer(recipientAccount, transferAmount);
	                        break;
	                    case 5:
	                        System.out.println("Thank you for using the ATM. Goodbye!");
	                        System.exit(0);
	                    default:
	                        System.out.println("Invalid choice. Please select a valid option.");
	                }
	            }
	        }
	    }
	}