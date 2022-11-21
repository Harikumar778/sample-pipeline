package com.harry.basic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping("/getproducts")
	List<Product> getInfo(){
		Product p1 = new Product("A01","Lenovo",10000);
		Product p2 = new Product("A02","HP",30040);
		Product p3 = new Product("A03","Samsung",130000);
		
		List<Product>prolist=new ArrayList<Product>();
		prolist.add(p1);
		prolist.add(p2);
		prolist.add(p3);
		return prolist;
	}
	@RequestMapping(value="/addproducts",method=RequestMethod.POST)
	void addinfo(@RequestBody Product p) {
		System.out.println(p);
		
		
		
	}

}
