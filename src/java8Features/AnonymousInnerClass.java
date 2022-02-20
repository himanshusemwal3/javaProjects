package java8Features;
import java.util.*;
public class AnonymousInnerClass {
	
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread is running");
				
			}
		}).run();
		
		
		new Thread(()->System.out.print("Thread 2 is running")).run();
	}

}
