package threading;

public class MyThread extends Thread implements Runnable{
	@Override
	public void run()
	{	
		//System.out.println()
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);		
			}
	}
	
	
	public static void main(String args[])
	{
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		//MyThread t3 = new MyThread();
		t1.start();
		t2.start();
		//t3.start();
		
	}
	
	

}
