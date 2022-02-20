package algo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class New1 {
	
	
	public static void main(String[] args) {
		
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(5);
		lis.add(5);
		lis.add(3);
		lis.add(1);
		lis.add(2);
		
		System.out.println(lis.stream().distinct().sorted().collect(Collectors.toList()));
		
	}

}
