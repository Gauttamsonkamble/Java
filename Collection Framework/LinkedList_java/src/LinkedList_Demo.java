import java.util.*;

public class LinkedList_Demo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList();
		
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		Iterator itr =list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
//		System.out.println(list);
		
	}

}
