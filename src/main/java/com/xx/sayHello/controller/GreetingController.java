package com.xx.sayHello.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xx.sayHello.model.ProductInventory;
import com.xx.sayHello.service.GreetingService;
import com.xx.sayHello.service.SayHelloService;

@RestController
public class GreetingController {

//	@Autowired
//	private GreetingService greetingService;
//	
//	@RequestMapping("/greeting")
//	public String greeting(@RequestParam String name) {
//		return greetingService.greeting(name);
//	}
	@Autowired
	private SayHelloService sayHelloService;
	
	@RequestMapping("/greeting")
	public String greeting(@RequestParam String name) {
		return sayHelloService.sayHello(name);
	}
	@RequestMapping("/updateProductInventory")
	public String updateProductInventory( ProductInventory productInventory) {
		return sayHelloService.updateProductInventory(productInventory);
	}
	@RequestMapping("/getProductInventory")
	public String getProductInventory(@RequestParam ("productId") Integer productId) {
		return sayHelloService.getProductInventory(productId);
	}
	
	@RequestMapping("/testUpdateDBLock")
	public String testUpdateDBLock(ProductInventory productInventory){
		return sayHelloService.testUpdateDBLock(productInventory);
	};
}
