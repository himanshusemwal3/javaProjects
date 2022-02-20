package dataStructure;
import java.util.*;
import java.io.*;
public class TestEnum {
	 enum days{monday,tuesday,wednesday,thrusday,friday,saturday};
	public static void main(String[] args) {
		//Set<days> s = EnumSet.allOf(days.class);
		Set<days> s = EnumSet.of(days.monday,days.tuesday);
		System.out.println(s);
		
	}

}
