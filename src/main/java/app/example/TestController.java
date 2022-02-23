package app.example;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/login")
	public Principal login(Principal principal) {
		
		
		return principal;
	}
}
