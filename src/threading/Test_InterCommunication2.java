package threading;
import java.util.*;
public class Test_InterCommunication2 {
	public static void main(String[] args) {
		
		final A a = new A();
		new Thread() {
			public void run() {
				try {
					a.method_1();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					a.method_2();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		
	}
	
	
	

}
class A{
	synchronized void method_1() throws Exception
	{
		System.out.println("st-1");
		wait();
		System.out.println("st-2");
		//wait();
	}
	synchronized void method_2() throws Exception
	{
		System.out.println("st-3");
		System.out.println("st-4");
		notify();
	}
	
	
}
