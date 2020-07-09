package com.learning.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.java.service.LoopService;

@RestController
@RequestMapping("/")
public class AdditionController {

	LoopService service = new LoopService();

	@GetMapping("/addition/twodigit")
	public Integer addition(@RequestParam("first") int firstDigit, @RequestParam("second") int secondDigit) {
		return firstDigit + secondDigit;
	}

	@GetMapping("/dummy")
	public long getFact(@RequestParam("n") int n) {
		return service.getFactorial(n);
	}
	
	@GetMapping("/sumofnumbers")
	public long getAddition(@RequestParam("n") int n) {
		return service.getAddition(n);
	}
}
