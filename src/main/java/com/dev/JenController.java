package com.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenController {

	@GetMapping(value = "/gethello")
	public String getWord() {
		return "HelloWorld";
	}
}
