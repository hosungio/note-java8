package note.java8.rest1sb2.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
public class ChildType1 extends ChildBase {
	private Boolean nullableIsFirstType;
	private Integer nullableAge;
}
