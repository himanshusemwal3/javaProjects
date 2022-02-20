package dataStructure;


interface Addable{
	public void draw(int a,int b);
	
}
public class LearnLambda {
	
	public static void main(String[] args) {
		Addable addable=new Addable() {

			@Override
			public void draw(int a, int b) {
				System.out.println(a+b);
				
			}
		
	};
	Addable addable1=(a,b)->{
			System.out.println(a+b);
			
		};
		
		addable.draw(10,20);
}
	
}
