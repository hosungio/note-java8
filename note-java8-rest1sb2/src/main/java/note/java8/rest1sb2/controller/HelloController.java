package note.java8.rest1sb2.controller;

import java.time.ZonedDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import note.java8.rest1sb2.dto.HelloRequest;
import note.java8.rest1sb2.dto.HelloResponse;
import note.java8.rest1sb2.dto.HelloWorld;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("")
	public @ResponseBody HelloWorld getHelloWorld() {
		return new HelloWorld("Hello, World!", ZonedDateTime.now());
	}

	@PostMapping("")
	public @ResponseBody HelloResponse getHello(
			@RequestBody HelloRequest request) {
		HelloResponse response = new HelloResponse(request.getId(),
				request.getUser());
		if (request.getTime() == null) {
			response.setTime(ZonedDateTime.now());
		} else {
			response.setTime(request.getTime());
		}
		if (request.getMessage() == null) {
			response.setMessage("Hello, " + request.getUser());
		} else {
			response.setMessage(request.getMessage());
		}
		return response;
	}
}
