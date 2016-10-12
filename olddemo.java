
import java.util.Scanner;

/**
  Mohammed Raza
  CSC 162 - Lab4 #4 (main)
*/

public class SavingsDemo
{
   public static void main(String[] args)
   {

	   double balance1;
	   double numdeposits1;
	   double numwithdrawals1;
	   double intrate1;
	   double charges1;
	   double deposit1;
	   double withdrawal1;


	  Scanner keyboard = new Scanner(System.in);

	  System.out.print("Starting Balance: ");
	  balance1 = keyboard.nextDouble();

	  System.out.print("Annual Interest Rate: ");
	  intrate1 = keyboard.nextDouble();

	  System.out.print("Monthly service charges: ");
	  charges1 = keyboard.nextDouble();

	  System.out.println("");

	  System.out.println("Enter deposit amount: ");
	  deposit1 = keyboard.nextDouble();

	  System.out.println("Enter withdrawal amount: ");
	  withdrawal1 = keyboard.nextDouble();

	  BankAccount obj = new BankAccount(balance1,intrate1,charges1,deposit1,withdrawal1);


	  System.out.println("Balance: " + obj.getBalance());
	  System.out.println("Number of Deposits: " + obj.getNumDeposits());
	  System.out.println("Number of Withdrawals: " + obj.getNumWithdrawals());


   }
}
