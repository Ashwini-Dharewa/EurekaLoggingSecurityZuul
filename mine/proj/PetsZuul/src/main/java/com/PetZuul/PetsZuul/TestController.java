package com.PetZuul.PetsZuul;


	
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	import javax.validation.Valid;

import java.util.List;

	@RestController
	public class TestController {
	 
	  
	  
	  
	  @RequestMapping(value = "/samplezulu", method = RequestMethod.GET)
	  public String getAllPets() {
		  
	    return "hello";
	  }
	  
	  
	}


