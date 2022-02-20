package threading;
import java.util.*;
/**
 * @author Semwals
 *
 */

public class CoinProblem {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=1;i<=10;i++)
		{
			list.addFirst(i);
		}
		list.stream().forEach(i->System.out.println(i));
		System.out.println("//\\//\\//\\//\\//\\//\\//\\//\\\\");
		
	}

}
