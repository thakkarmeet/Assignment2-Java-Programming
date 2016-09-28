
public class BankAccount {


	
	public String accountNumber ;
	public String ownersName ;
	public double balance ;
	public double withdraw;
	public double deposit;
	public double rBalance =0;
    
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwnersname() {
		return ownersName;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
		public double RDeposits()
	{
	    rBalance = balance + deposit;
	    return rBalance;
	}
	public double RWithdrawals()
	{
	   rBalance = rBalance - withdraw;
		return rBalance;
	}

		public BankAccount(String AccountNumber, String OwnersName,double Balance,double Deposit,double Withdraw, double rBalance)
	{
		this.accountNumber = AccountNumber;
	    this.ownersName = OwnersName;
	    this.balance = Balance;
	    this.deposit = Deposit;
	    this.withdraw = Withdraw;
	    this.rBalance = rBalance;
	}
	
	
	public void getAccountInfo()
	{
		System.out.printf("%n AccountNumber: "+this.accountNumber+"%n OwnersName: "+this.ownersName+"%n Balance: "+this.balance+"%n Deposit:"+this.deposit+"%n Withdraw"+ this.withdraw+"%n YOUR REMAINING BALANCE IS:"+this.rBalance	);
	}
}
