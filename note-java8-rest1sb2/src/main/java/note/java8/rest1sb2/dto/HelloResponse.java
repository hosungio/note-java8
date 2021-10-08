package note.java8.rest1sb2.dto;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class HelloResponse {
	private final long id;
	private final String user;
	private ZonedDateTime time;
	private String message;
}
