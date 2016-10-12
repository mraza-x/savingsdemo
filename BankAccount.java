/**
  Mohammed Raza
  CSC 162 - Lab4 #4 (class1)
*/

public abstract class BankAccount
{

   	   public double balance;
   	   public double newbal;

   	   public double deposits;
   	   public double numdeposits = 0;

   	   public double withdrawals;
   	   public double numwithdrawals = 0;

   	   public double intrate;
   	   public double monintrate;
   	   public double interest;

	   public double charges;


   public BankAccount()
   {

   }

   public BankAccount(double bal, double intr, double ch, double dep, double with)
   {
	   balance = bal;
	   intrate = intr;
	   charges = ch;
	   deposits = dep;
	   withdrawals = with;

   }


   public void deposit(double dep)
   {
	   deposits = dep;
   }

   public void withdrawal(double with)
   {
	   withdrawals = with;
   }

   public void calcInterest(double intr)
   {
	   intrate = intr;

	   monintrate = intrate /12;

	   interest = balance * monintrate;

	   balance = balance + interest;

   }

   public void setMonthlyServiceCharges(double ch)
   {
	   charges = ch;
   }

   public void monthlyProcess()
   {
   	   balance = balance - charges + intrate;
   }

   public double getBalance()
   {
	   balance = balance + deposits - withdrawals;
	   return balance;
   }

   public double getNumDeposits()
   {
	   numdeposits = numdeposits + 1;
	   return numdeposits;
   }

   public double getNumWithdrawals()
   {
	   numwithdrawals = numwithdrawals + 1;
	   return numwithdrawals;
   }

   public double getInterestRate()
   {
	   return interest;
   }

   public double getMonthlyServiceCharges()
   {
	   return charges;
   }



}