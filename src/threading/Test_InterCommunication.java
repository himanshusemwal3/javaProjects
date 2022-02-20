package threading;
import java.util.*;
public class Test_InterCommunication {
	
	
	public static void main(String[] args) {
		
		final Bank customer = new Bank();
		new Thread() {
			public void run()
			{
				try {
					customer.withdraw(1500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run()
			{
				try {
					customer.deposit(1500);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		
		
		
		
	}

}

class Bank{
	int amount = 1000;
	
	
	synchronized void withdraw(int amount) throws Exception
	{	
		
		System.out.println("Going to Withdraw ");
		if(this.amount<amount)
		{
			System.out.println("Not enough funds to withdraw Please deposit some funds !!!!!");
			wait();
			
			
		}
		this.amount-=amount;
		System.out.println("Withdraw Completed transaction Successful !!!!");
	}
	
	synchronized void deposit(int amount) throws Exception
	{
		System.out.println("Going to Deposit");
		this.amount+=amount;
		System.out.println("deposit completed Successfully !!!!");
		notify();
		
		
	}
	
	
	
	
	
	
	
	
}
