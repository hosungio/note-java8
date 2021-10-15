package note.java8.rest1sb2.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString(callSuper = true)
public class ChildType2 extends ChildBase {
	private boolean isSencodType;
	private int age;
}
