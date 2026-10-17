package Revision;

public class BankBalace {
	

	private static double balance=1000;

	 static double amount;
	
	public double getBalance() {
		return balance;
	}


	public BankBalace(double amount) {
		super();
		this.amount = amount;
	}


	public double getAmount() {
		return amount;
	}


	


	public void Account(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative"
            );
        }
        this.balance = balance;
    }
	
	
	public void withdraw(double amount)
	{
		if (amount <= 0 || amount > balance)
		{
			 throw new IllegalArgumentException(
		                "Initial balance cannot be negative"
		            );
		}
		
		balance = balance-amount;
		return;
		
	}
	
	
	
	public void depsit(double amount)
	{
		if(amount <=  0)
		{
			 throw new IllegalArgumentException(
		                "Initial balance cannot be negative"
		            );
		}
		
		balance = balance+amount;
		return;
		
	}
	public static void main(String[] args) {	
		
		BankBalace b= new BankBalace(amount);
		b.depsit(1000);
		
		System.out.println("the uupdate amount after deploist : "+ b.getBalance());
		
		
		b.withdraw(300);

		
		System.out.println("the uupdate amount after withrow : "+ b.getBalance());
		
		

	}

}
