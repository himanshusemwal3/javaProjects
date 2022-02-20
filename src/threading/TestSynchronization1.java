package threading;
import java.util.*;
public class TestSynchronization1 {
	
	
	public static void main(String[] args) {
		final MyTable table = new MyTable();
		MyThread1 t1 = new MyThread1(table);
		MyThread2 t2 = new MyThread2(table);
		t1.start();
		t2.start();
		
	}
		

}
class MyThread1 extends Thread
{	
	private MyTable t ;
	MyThread1(MyTable t){
		this.t=t;
		
	}
	@Override
	public void run()
	{
		t.print_table(5);
	}
}

class MyThread2 extends Thread
{	
	private MyTable t ;
	MyThread2(MyTable t){
		this.t=t;
		
	}
	@Override
	public void run()
	{
		t.print_table(100);
	}
}

class MyTable{
	
	 public void print_table(int n)
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