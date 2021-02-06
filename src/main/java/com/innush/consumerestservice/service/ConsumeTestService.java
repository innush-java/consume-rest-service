package com.innush.consumerestservice.service;

import com.innush.consumerestservice.service.model.TestServiceResponse;

public interface ConsumeTestService {
	
	public String invokeRestService();
	
	public TestServiceResponse invokeAndReturnResponseObject();
	
	//public List<TestServiceResponse> invokeAndReturnResponseObjects();
	public TestServiceResponse[] invokeAndReturnResponseObjects();
	

}
