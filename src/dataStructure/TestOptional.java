package dataStructure;
import java.util.*;
public class TestOptional {

	
	public static void main(String[] args) {
		String[] s = new String[10];
		Optional<String> op=Optional.ofNullable(s[6]);
		System.out.println(op.isPresent());
		
	}
}
