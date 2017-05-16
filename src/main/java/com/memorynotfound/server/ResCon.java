package com.memorynotfound.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResCon {
	  @RequestMapping("/")
	    public String hello()
	    {
	    	return "jjjj";
	    }
	  
}
