package com.Aws.deployment.practice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RestApi {
	
	@RequestMapping("/deply")
	public String m1() {
		
		
		return "Deploymentst git piush"; 
	}

}
