package com.innush.consumerestservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.innush.consumerestservice.service.ConsumeTestService;
import com.innush.consumerestservice.service.model.TestServiceResponse;

@Service
public class ConsumeTestServiceImpl implements ConsumeTestService {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${externalServiceUrl}")
	private String url;
	
	@Value("${externalServiceUrlList}")
	private String listUrl;
	
	@Override
	public String invokeRestService() {
		
		return restTemplate.getForObject(url, String.class);
		
	}
	
	@Override
	public TestServiceResponse invokeAndReturnResponseObject() {
		
		 return restTemplate.getForObject(url, TestServiceResponse.class);
		
	}

	@Override
	public TestServiceResponse[] invokeAndReturnResponseObjects() {
		
		ResponseEntity<TestServiceResponse[]> responseEntity = restTemplate.getForEntity(listUrl, TestServiceResponse[].class);
		
		return responseEntity.getBody();
		
	}
	
}
