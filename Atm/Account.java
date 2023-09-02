package Atm;
public class Account {

	int accountNumber;
    int balance;
    String transactionHistory;

    Account(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        	System.out.println("Transaction Succesful,current balance is:"+balance);
            transactionHistory += "\nDeposited: " + amount;
        }
    }

    void withdraw(int amount ) {
    	if(amount>=0) {
			balance-=amount;
			System.out.println("Transaction Succesful,current balance is:"+balance);
            transactionHistory += "\nWithdrawn: " + amount;
        }
    }

    void transfer(Account recipient, int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Tranfer Succesful,current balance is:"+balance);
            recipient.balance += amount;
            transactionHistory += "\nTransferred: " + amount + " to Account " + recipient.accountNumber;
            recipient.transactionHistory += "\nReceived: " + amount + " from Account " + accountNumber;
        }
    }

    String getTransactionHistory() {
        return transactionHistory;
    }
}
