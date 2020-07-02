package com.xx.sayHello.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xx.sayHello.model.ProductInventory;
import com.xx.sayHello.service.fallback.SayHelloServiceFallback;

//@FeignClient(value = "say-hello-service")  
@FeignClient(name = "say-hello-service", fallback = SayHelloServiceFallback.class)
public interface SayHelloService {

//	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)   另一种写法
	@GetMapping(value = "/sayHello")
	public String sayHello(@RequestParam(value = "name") String name);
	@GetMapping(value = "/updateProductInventory")
	public String updateProductInventory(ProductInventory productInventory);
	@GetMapping(value = "/getProductInventory")
	public String getProductInventory(@RequestParam("productId") Integer productId);
	@GetMapping("/testUpdateDBLock")
	public String testUpdateDBLock(ProductInventory productInventory);
	
}
