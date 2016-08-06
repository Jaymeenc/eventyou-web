package org.eventyou.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
@RequestMapping(value="/")	
public String  getData(){
	
	
	
	return "Hello there!";
	
	
	
}	

}
