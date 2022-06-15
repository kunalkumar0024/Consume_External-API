package com.kunal.kumar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceLayer {
	
private final RestTemplate restTemplate;
@Autowired
public ServiceLayer(RestTemplate restTemplate) {
	this.restTemplate=restTemplate;
   }
   
    public String consumeAPI() {
    	String url="https://coreuat-zwqcqy3qmq-el.a.run.app/getlogintoken";
    	return restTemplate.getForObject(url,String.class);
    }
}
