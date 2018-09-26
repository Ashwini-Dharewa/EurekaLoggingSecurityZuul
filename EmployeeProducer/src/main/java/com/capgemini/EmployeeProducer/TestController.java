package com.capgemini.EmployeeProducer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class TestController {
	
	@RequestMapping(value="/employee" ,method=RequestMethod.GET)
	@HystrixCommand(fallbackMethod="getDataFallBack")
	public Employee firstPage()
	{
		Employee emp1=new Employee();
		emp1.setName("Abhrak");
		emp1.setDesignation("Analyst");
		emp1.setSalary(15505);
		emp1.setEmpid("155128");
		if(emp1.getName().equals("abhrak"))
			throw new RuntimeException();
		
		return emp1;
		
		
	}
	
	public Employee getDataFallBack()
	{
		Employee emp1=new Employee();
		emp1.setName("fallback-Abhrak");
		emp1.setDesignation("fallback-Analyst");
		emp1.setSalary(15505);
		emp1.setEmpid("fallback-155128");
		
		
		return emp1;
		
		
	}

}
