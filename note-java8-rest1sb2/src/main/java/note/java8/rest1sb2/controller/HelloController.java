package note.java8.rest1sb2.controller;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import note.java8.rest1sb2.dto.HelloRequest;
import note.java8.rest1sb2.dto.HelloResponse;
import note.java8.rest1sb2.dto.HelloWorld;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("")
	public HelloWorld getHelloWorld() {
		return new HelloWorld("Hello, World!", ZonedDateTime.now());
	}

	@PostMapping("")
	public HelloResponse getHello(
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
	
	@GetMapping("err/404")
	public void err404() {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, 
				"Your resource not found");
	}
	
	@PostMapping("err/400")
	public void err400(@RequestBody String body) {
		System.out.println(body);
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, 
				"Your request not valid");
	}
	
	@GetMapping("err/500")
	public void err500() {
		throw new RuntimeException("A server error caused by ...");
	}
}
