package threading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool implements Runnable{
	
	String message;
	TestThreadPool(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Start (Message) - "+message);
		processMessage();
		System.out.println(Thread.currentThread().getName()+" Start (End)");
		
		
		
	}
	public void processMessage()
	{
		try {Thread.sleep(2000);}
		catch(Exception e) {System.out.println(e);}
	}

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(5);
		for(int i=1;i<9;i++)
		{
			TestThreadPool thread= new TestThreadPool(String.valueOf(i));
			executor.execute(thread);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {}
		System.out.println("Finished All Threads ");
	}
}


