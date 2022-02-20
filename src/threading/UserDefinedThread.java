package threading;

public class UserDefinedThread  extends Thread implements Runnable{
	
	@Override
	public void run() {
		
		System.out.println("thread is running");
		for(int i =1;i<=5;i++)
		{
			try {
				Thread.sleep(5000);
				System.out.println(i);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	
	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		UserDefinedThread t1 = new UserDefinedThread();
		UserDefinedThread t2 = new UserDefinedThread();
		t1.start();
		t2.start();
	}

}
