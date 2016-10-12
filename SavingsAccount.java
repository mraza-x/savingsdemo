/**
  Mohammed Raza
  CSC 162 - Lab4 #4 (class2)
*/

public class SavingsAccount extends BankAccount

{
	public boolean status;

	   public SavingsAccount(double bal, double intr, double ch, double dep, double with)
	   {
		   balance = bal;
		   intrate = intr;
		   charges = ch;
		   deposits = dep;
		   withdrawals = with;
	   }


	   public void withdraw()
	   {
		   if (balance < 25)
		   {
		   		status = false;
		   		System.out.println("Account Inactive, you may only deposit into account");
			}

		   else
		   {
		   		status = true;
			}

		}

		public void deposit()
		{
			if (balance < 25)
			{
				status = false;
			}

			else
			{
				status = true;
				System.out.println("Account Active, you may make withdrawals");
			}

	    }

	    public void monthlyProcess()
	    {

			if (numwithdrawals > 4)
			{

			 balance = balance - charges + intrate - 1;

		    }
		    else
		    {
				balance = balance - charges + intrate;
			}
		}


}