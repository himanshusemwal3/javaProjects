package threading;

public class TestDaemonThread1 extends Thread{
	
	@Override
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Working");
		}
		else
		{
			System.out.println("Other Threads are working");
		}
	}
	
	public static void main(String[] args) {
		TestDaemonThread1 t1 = new TestDaemonThread1();
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
