

package java8Features;

import java.util.*;
import java.util.function.*;

public class StudyFunction {
	
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp("himanshu", 10000));
		list.add(new Emp("rishi", 10000));
		list.add(new Emp("shirkant", 10000));
		list.add(new Emp("yogesh", 20000));
		
		Function<List<Emp>,Double> f=l->{
			
			double salary = 0.0;
			for(Emp e :l)
			{
				salary+=e.salary;
				
			}
			return salary;
		};
		
		
		System.out.println(list);
		System.out.println("Total salary is : "+ f.apply(list));
		
	}
	
	
	

}
 class Emp
 {
	 String name;
	 double salary;
	 Emp(String name,double salary)
	 {
		 this.name=name;
		 this.salary=salary;
	 }
	 
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" : "+salary;
	}
 }
