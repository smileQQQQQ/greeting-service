package com.xx.sayHello.service.fallback;


import org.springframework.stereotype.Component;

import com.xx.sayHello.model.ProductInventory;
import com.xx.sayHello.service.SayHelloService;

@Component
public class SayHelloServiceFallback implements SayHelloService {

	public String sayHello(String name) {
		return "error, " + name;
	}


	public String updateProductInventory(ProductInventory productInventory) {
		return "error, " + productInventory;
	}

	public String getProductInventory(Integer productId) {
		return "error, " + productId;
	}


	public String testUpdateDBLock(ProductInventory productInventory) {
		return "error, " + productInventory;
	}


}
