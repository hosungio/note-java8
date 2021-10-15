package note.java8.rest1sb2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import note.java8.rest1sb2.dto.ChildBase;
import note.java8.rest1sb2.dto.ChildBaseList;
import note.java8.rest1sb2.dto.ChildType1;
import note.java8.rest1sb2.dto.ChildType2;

@RestController
@RequestMapping("/child")
public class ChildController {

	@GetMapping("")
	public ChildBaseList getList() {
		ChildType1 c1 = new ChildType1();
		c1.setId("c-001");
		c1.setName("foo");
		c1.setNullableIsFirstType(true);
		ChildType2 c2 = new ChildType2();
		c2.setId("c-002");
		c2.setName("bar");
		c2.setSencodType(true);
		
		List<ChildBase> list = new ArrayList<ChildBase>();
		list.add(c1);
		list.add(c2);
		return new ChildBaseList(list);
	}
	
	@PostMapping("type1")
	public ChildType1 createChildType1(
			@RequestBody ChildType1 child1) {
		ChildType1 c1 = new ChildType1();
		c1.setId(child1.getId());
		c1.setName(child1.getName());
		if (child1.getNullableIsFirstType() != null) {
			c1.setNullableIsFirstType(
					child1.getNullableIsFirstType());
		}
		if (child1.getNullableAge() != null) {
			c1.setNullableAge(child1.getNullableAge());
		}
		return c1;
	}
}
