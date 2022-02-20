package threading;

public class TestRuntime extends Thread {
	
	public void run() {
		System.out.println("Running");
	}
	public static void main(String[] args) {
		new TestRuntime().start();
		
	}

}
