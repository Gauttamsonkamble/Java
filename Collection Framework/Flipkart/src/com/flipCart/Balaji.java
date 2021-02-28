package com.flipCart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flipCart.model.Order;

public class Balaji {

	public List<Order> list()
	{
		@SuppressWarnings("rawtypes")
		ArrayList list =new ArrayList();
		list.add(1);
		list.add("Nanded");
		list.add("Laptop");
		list.add("Deliverd");
		
		list.add(2);
		list.add("pune");
		list.add("mobile");
		list.add("Deliverd");
		
		return list;
	}
}