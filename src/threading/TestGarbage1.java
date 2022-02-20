package threading;

public class TestGarbage1 {
	
	public void finalize() {
		System.out.println("Garbage is collected");
	}
	public static void main(String[] args) {
		TestGarbage1 obj1=new TestGarbage1();

		TestGarbage1 obj2=new TestGarbage1();
		obj1=null;
		obj2=null;
		System.gc();
	}

}
