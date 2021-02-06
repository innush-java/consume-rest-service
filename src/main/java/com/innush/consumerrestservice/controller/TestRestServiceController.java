package com.innush.consumerrestservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.innush.consumerestservice.service.ConsumeTestService;
import com.innush.consumerestservice.service.model.TestServiceResponse;

@RestController
public class TestRestServiceController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ConsumeTestService consumeTestService;
	
	/*
	 * This method will return the external service response in String format
	 * 
	 * { "userId": 1, "id": 1, "title": "delectus aut autem", "completed": false }
	 * 
	 */
	
	@GetMapping("/invoke")
	public String invokeRestService() {
		
		return consumeTestService.invokeRestService();
		
	}
	
	/*
	 * This method will return the external service response in object which is TestServiceResponse format
	 * 
	 * { "userId": 1, "id": 1, "title": "delectus aut autem", "completed": false }
	 * 
	 */
	@GetMapping("/invokeAndReturnResponseObject")
	public TestServiceResponse invokeAndReturnResponseObject() {
		
		return consumeTestService.invokeAndReturnResponseObject();
		
	}
	
	/*
	 * This method will return the external service response in list of objects or array of objects
	 * 
	 * [  {"userId":1,"id":1,"title":"delectus aut autem","completed":false},
	 * {"userId":1,"id":2,"title":"quis ut nam facilis et officia qui","completed":false},
	 * {"userId":1,"id":3,"title":"fugiat veniam minus","completed":false},
	 * {"userId":1,"id":4,"title":"et porro tempora","completed":true}
	 * ]
	 * 
	 */
	@GetMapping("/invokeAndReturnResponseObjectList")
	public TestServiceResponse[] invokeAndReturnResponseObjects() {
		
		return consumeTestService.invokeAndReturnResponseObjects();
		
	}
	
}
