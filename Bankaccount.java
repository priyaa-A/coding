public class Bankaccount {
	private int accountnumber;
	private double balance;
	
	//getter method to get accountnumber;
	 public  int getaccountnumber()
	 {
		 return accountnumber;
	 }
	 
	 //getter method to get balance;
	 public double getbalance()
	 {
		 return balance;
	 }
	 
	 //setter method 
	 public void setaccountnumber(int accountnumber)
	 {
		 this.accountnumber= accountnumber;
	 }
	 
	 //setter method
	 public void setbalance(double balance)
	 {
		 this.balance=balance;
	 }
	 
	 public static void main(String args[])
	 {
		 Bankaccount b1=new Bankaccount();
		 b1.setaccountnumber(123456789);
		 b1.setbalance(35000.00);
		 System.out.println("your account number is: "+b1.getaccountnumber());
		 System.out.println("your balance is: "+b1.getbalance());
		 
	 }

}
