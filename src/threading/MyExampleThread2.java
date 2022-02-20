package threading;

public class MyExampleThread2 extends Thread implements Runnable {
	
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				
				Thread.sleep(200);
				System.out.println(Thread.currentThread().getName()+" - "+i);
				
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
			
			
		}
		
		
		
	}
	public static void main(String[] args) {
		MyExampleThread2 t1 = new MyExampleThread2();
		MyExampleThread2 t2=new MyExampleThread2();
		t1.run();
		t2.run();
	}
	
	
	
	
	

}
