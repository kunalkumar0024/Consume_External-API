package com.kunal.kumar.service;

import org.springframework.web.client.RestTemplate;

import com.kunal.kumar.controller.HomeController;

public interface ServiceInt {
	HomeController ServiceLayer(RestTemplate restTemplate);
	
	public String consumeAPI();

}
