package gm.gestionale.gmmoneymodule.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

	@GetMapping("/test")
	public String testResource() {
		return "EASY";
	}
	
}
