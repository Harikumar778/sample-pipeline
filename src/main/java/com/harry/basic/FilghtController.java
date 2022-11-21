package com.harry.basic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilghtController {
	
	@RequestMapping("/getflights")
	List<Flight> getInfo(){
		
		Flight f1=new Flight("Hyd","Mumbai","20-06-2022","Indigo");
		Flight f2=new Flight("Hyd","Mumbai","20-06-2022","SpiceJet");
		Flight f3=new Flight("Mumbai","Bangalore","20-06-2022","AirAsia");
	
		
		List<Flight> flightList = new ArrayList<Flight>();
		
		flightList.add(f1);
		
		flightList.add(f2);
		
		flightList.add(f3);
		
		return flightList;
	}
		
		@RequestMapping(value="/addfilght",method=RequestMethod.POST)
		void addinfo(@RequestBody Flight f) {
			System.out.println(f);
			
			
		}
		
	
}
