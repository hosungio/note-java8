package note.java8.rest1sb2.dto;

import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ChildBaseList {
	private long count;
	private List<ChildBase> list;
	
	public ChildBaseList(List<ChildBase> list) {
		if (list == null) {
			this.count = 0;
		} else {
			this.count = list.size();
		}
		this.list = list;
	}
}
