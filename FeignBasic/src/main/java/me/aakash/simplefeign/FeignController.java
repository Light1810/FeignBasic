package me.aakash.simplefeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
	
	@Autowired
	EmpDetailsClient empdetailsClient;
	
	@GetMapping("/fetchone")
	public ResponseEntity < ? > fetchone() {

		  return ResponseEntity.ok(empdetailsClient.getone());
		 }

	
	@GetMapping("/fetchall")
	public ResponseEntity < ? > fetchall() {

		  return ResponseEntity.ok(empdetailsClient.getall());
		 }
}
