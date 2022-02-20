package dataStructure;
import java.util.*;
public class LearnComparable {

	
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101,"Shrikant",98));
		list.add(new Student(100,"Himanshu",99));
		list.add(new Student(99,"Yogesh",100));
		Collections.sort(list);
		list.stream().forEach(i->System.out.println(i.rno+"  "+i.name+"  "+i.marks));
		Collections.sort(list,new MarksComparator());
		list.stream().forEach(i->System.out.println(i.rno+"  "+i.name+"  "+i.marks));
		Collections.sort(list,(s1,s2)->{return s1.marks.compareTo(s2.marks);});
		
		
	}
}

class Student implements Comparable<Student>
{
	Integer rno;
	String name;
	Integer marks;
	Student(Integer rno, String name, Integer marks)
	{
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	
	
	

	@Override
	public int compareTo(Student stud) {
		if(rno==stud.rno)
		{
			return 0;
		}
		else if(rno>stud.rno)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
}

class MarksComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.marks==s2.marks)
		{
			return 0;
		}
		else if(s1.marks>s2.marks)
		{
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
}