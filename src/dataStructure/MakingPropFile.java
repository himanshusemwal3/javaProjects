package dataStructure;
import java.util.*;
import java.io.*;
public class MakingPropFile {
	
	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		p.setProperty("user","Himanshu");
		p.setProperty("password","password@123");
		p.store(new FileWriter("info.properties"),"credentials");
		
	}

}
