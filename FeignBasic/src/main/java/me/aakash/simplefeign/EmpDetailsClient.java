package me.aakash.simplefeign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "emp-details",url="http://localhost:8081")
public interface EmpDetailsClient {
	
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public EmpDetails getone();
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
	public List<EmpDetails> getall();
	
}
