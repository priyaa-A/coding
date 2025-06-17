class BankAccount{
	  //double amount;
	  double balance;
	public void deposit(double amount)
	{
	     balance+=amount;
		System.out.println("You deposit some amount in our bank!! now,your balance is :"+balance);
	}
	
	public void withdraw(double amount)
	{
	     balance-=amount;
		System.out.println("you withdrawal some amount , now your balance is : " +balance);
	}
}

class Savingsaccounts extends BankAccount{
	public void withdraw(double amount)
	{
		
		if(balance - amount <=100)
		{
		  System.out.println("you have insuffiecent account balance");
		}
		else
		{
			System.out.println("you are able to withdraw your amount");
		}
		
	}
}
	public class Myaccount {
		 public static void main(String args[])
    	  {
    		  Savingsaccounts s1=new Savingsaccounts();
    		  s1.balance=50000.00;
    		  s1.deposit(40000.00);
    		  s1.withdraw(20000.00);
    		  s1.withdraw(69950.00);
    		  
   }}


	
		
	