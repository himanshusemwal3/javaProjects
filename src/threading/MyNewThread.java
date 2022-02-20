package threading;

public class MyNewThread extends Thread implements Runnable {
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(500);	
				System.out.println(Thread.currentThread().getName()+"--->"+i);
			}
			catch(InterruptedException e)
			{
				 System.out.println(e);
			}
		}
	}
	
	public static void main(String args[])
	{
		MyNewThread t1 = new MyNewThread();
		MyNewThread t2= new MyNewThread();
		t1.setName("First Thread");
		t2.setName("Second Thread");
		t2.start();
		t1.start();
	}

}
