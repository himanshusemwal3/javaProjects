package threading;

import java.io.IOException;

public class TestMultiPriority1 extends Thread{
	
	
	@Override
	public void run() {
		
		//System.out.println();
		System.out.println("Thread Name "+ Thread.currentThread().getName()+" Thread Priority "+Thread.currentThread().getPriority());
				
	}
	
	public static void main(String[] args) {
		
		
		TestMultiPriority1 t1 = new TestMultiPriority1();
		t1.setName("1st");
		t1.setPriority(Thread.MIN_PRIORITY);
		TestMultiPriority1 t2 = new TestMultiPriority1();
		t2.setName("2nd");
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
	}

}
