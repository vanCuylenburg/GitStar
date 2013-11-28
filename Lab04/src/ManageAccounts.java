import java.text.NumberFormat;

// ************************************************************
// ManageAccounts.java
//
// Use Account class to create and manage Sally and Joe's
// bank accounts
// ************************************************************


public class ManageAccounts
{

	public static void main(String[] args)
	{
		Account acct1, acct2;
		double chargedAcct1;
		double chargedAcct2;
		double balance;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		//create account1 for Sally with $1000
	
		acct1 = new Account(1000, "Sally ", 1111);
		//create account2 for Joe with $500
		acct2 = new Account(500, "Joe ", 42069);
		//deposit $100 to Joe's account
		acct2.deposit(100);
		//print Joe's new balance (use getBalance())
		balance = acct2.getBalance();
		System.out.println("Joes new balance: " + money.format(balance));
		//withdraw $50 from Sally's account
		acct1.withdraw(50);
		//print Sally's new balance (use getBalance())
		balance = acct1.getBalance();
		System.out.println("Sally's new balance: " + money.format(balance));
		//charge fees to both accounts
		chargedAcct1 = acct1.chargeFee();
		System.out.println("Sally's new balance after charge: " + chargedAcct1);
		chargedAcct2 = acct2.chargeFee();
		System.out.println("Joe's new balance after charge: " + chargedAcct2);
		//change the name on Joe's account to Joseph
		acct2.changeName("Joseph ");
		//print summary for both accounts
		System.out.println(acct1);
		System.out.println(acct2);
	}
}
