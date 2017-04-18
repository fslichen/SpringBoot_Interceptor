package evolution.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import evolution.controller.dto.AnyDto;

@RestController
public class AnyController {
	@PostMapping("/post")
	public void get(@RequestBody AnyDto anyDto) {
		
	}
}
