import java.util.Scanner;
public class BankAccountTest {
//Jasleen Kaur Assignment 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
			try{
				String AccountNumber="NJDF54D";
				String OwnersName ="JASLEEN KAUR";
				double Balance = 100;
				double rBalance = 0;
			
			
			
			
			System.out.println("Enter the amount you want to deposit:");
			double Deposit =Double.parseDouble(input.nextLine());
				
			System.out.println("Enter the amount you want to withdraw:");
			double Withdraw =Double.parseDouble(input.nextLine());
			
			BankAccount  BA1 = new BankAccount(AccountNumber, OwnersName, Balance, Deposit, Withdraw,  rBalance);
			BA1.RDeposits();
			BA1.RWithdrawals();
			BA1.getAccountInfo();
			
			}finally{
				input.close();
			}
			
	       		
			
			
			
			
		}

	}


