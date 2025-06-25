package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
	
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(defaultValue = "UNKNOWN")String name) {
		return "Hi " + name + "! Maven project is running!!";
	}
	
	@GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
	public String saluda2(@PathVariable(required = false) String name) {
		if(name == null) {
			name = "UNKNOWN";
		}
		return "Hi " + name + "! Maven project is running!!";
	}

}
