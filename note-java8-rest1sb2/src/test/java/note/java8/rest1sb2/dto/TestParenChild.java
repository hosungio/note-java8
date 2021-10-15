package note.java8.rest1sb2.dto;

import java.util.ArrayList;
import java.util.List;

public class TestParenChild {
	public static void main(String[] args) {
		ChildType1 c1 = new ChildType1();
		c1.setId("c-001");
		c1.setName("foo");
		c1.setNullableIsFirstType(true);
		ChildType2 c2 = new ChildType2();
		c2.setId("c-002");
		c2.setName("bar");
		c2.setSencodType(true);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();
		
		ChildType1 c1Copy = new ChildType1();
		c1Copy.setId("c-001");
		c1Copy.setName("foo");
		c1Copy.setNullableIsFirstType(true);
		System.out.println(c1.hashCode());
		System.out.println(c1Copy.hashCode());
		System.out.println(c1 == c1Copy);
		System.out.println(c1.getId() == c1Copy.getId());
		System.out.println();
		
		List<ChildBase> list1 = new ArrayList<ChildBase>();
		list1.add(c1);
		list1.add(c2);
		List<ChildBase> list2 = new ArrayList<ChildBase>();
		System.out.println(new ChildBaseList(list1));
		System.out.println(new ChildBaseList(list2));
		System.out.println();
	}
}
