package threading;
import java.util.*;
public class TestSynchronization2 {
	
	public static void main(String[] args) {
		final MyTable2 table = new MyTable2();
		ThreadOne t1 = new ThreadOne(table);
		ThreadTwo t2 = new ThreadTwo(table);
		//t1.start();
		t2.start();
		t1.start();
		
	}
		

}
class ThreadOne extends Thread
{	
	private MyTable2 t ;
	ThreadOne(MyTable2 t){
		this.t=t;
		
	}
	@Override
	public void run()
	{
		t.print_table(5);
	}
}

class ThreadTwo extends Thread
{	
	private MyTable2 t ;
	ThreadTwo(MyTable2 t){
		this.t=t;
		
	}
	@Override
	public void run()
	{
		t.print_table(100);
	}
}

class MyTable2{
	
	 synchronized public void print_table(int n)
	{
		for(int i =1;i<=5;i++)
		{
			System.out.println(n*i);
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException e)
			{
				//
			}
		}
	}
	
}