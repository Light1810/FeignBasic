package me.aakash.simplemicroservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@GetMapping("/get")
	public EmpDetails  getoutput()
	{
		return new EmpDetails("Aakash","8967157120",22,"Developer");
	}
	
	@GetMapping("/getall")
	public List<EmpDetails>  getoutputall()
	{
		return Arrays.asList(new EmpDetails("Aakash","8967157120",22,"Developer"),
							new EmpDetails("Purnima","9332033550",43,"HouseWife"),
							new EmpDetails("Sanjay","9800868825",50,"Service")				);
	}

}
