import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(5);
		alist.add(6);
		alist.add(6);
		alist.add(7);
		alist.add(8);
		//for loop
		//For each loop
		//iterator and interator ()
		Iterator<Integer> itr = alist.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
