package com.Gauttam;

import java.util.ArrayList;

public class ArrayList_Programs {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			
			list.add(5,8);
			list.add("Gauttam");
//			list.clear();
			list.remove(0);
			
			
			System.out.println(list);

	}

}
