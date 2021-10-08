package note.java8.rest1sb2.dto;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class HelloWorld {
	private final String message;
	private final ZonedDateTime time;
}
