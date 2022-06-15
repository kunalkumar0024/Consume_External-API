package com.kunal.kumar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kunal.kumar.service.ServiceInt;

@RestController
public class HomeController {
	@Autowired
	private final ServiceInt serviceInt;
	
	public HomeController(ServiceInt serviceLayer) {
		this.serviceInt=serviceLayer;
	}
	@GetMapping("https://coreuat-zwqcqy3qmq-el.a.run.app/user/getuserprofile")
	public String getData(String token) {
	return serviceInt.consumeAPI();	
	}
	
//	@GetMapping("https://coreuat-zwqcqy3qmq-el.a.run.app/user/getuserprofile?{token}")
//	public String getData(@RequestParam("token") String token) {
//	return serviceLayer.consumeAPI();	
//	}
}
