package com.example.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping ("/employees")
public class EmployeeController {
	
	public List<Employee> empList = Arrays.asList(
		new Employee (10L, "First5 Last5", "Developer"),
		new Employee (20L, "First4 Last4", "Admin"),
		new Employee (30L, "First3 Last3", "Tester"),
		new Employee (40L, "First2 Last2", "Manager"),
		new Employee (50L, "First1 Last1", "Developer")
	);
	
	@GetMapping ("/all")
	public List<Employee> findAllEmployees () {
		return empList;
	}
	
	@GetMapping ("")
	public List<Employee> findEmpByUserName (@RequestParam String name) {
		List<Employee> tempList = null;
		if (name == null || name.equalsIgnoreCase("")) {
			tempList = Collections.emptyList();
		} else {
			//tempList = empList.stream().filter(r -> r.getName().equalsIgnoreCase(name));
		}
		return tempList;
	}

}
