package threading;

public class TestSyncUsingAnonymous {
	
	public static void main(String[] args) {
		final TableClass table = new TableClass();
		Thread t1  = new Thread() {
			@Override
			public void run()
			{
				table.print_table(5);
			}
		};
		Thread t2  = new Thread() {
			@Override
			public void run()
			{
				table.print_table(5);
			}
		};
		
		t1.start();
		t2.start();
		
		
		
	}

}
 class TableClass{
	 synchronized  void print_table(int n)
	 {
		 for(int i =1 ;i<=5;i++)
		 {
			 System.out.println(n*i);
			 try {
				 Thread.sleep(400);
			 }
			 catch(Exception e)
			 {
				 //
			 }
		 }
	 }
	 
	 
 }
