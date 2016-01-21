package com.shash.spring.mvc.expert1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shash.spring.mvc.expert1.employeeVO.Employee;
import com.shash.spring.mvc.expert1.manager.EmployeeManager;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeManager manager;
	
	

	public EmployeeManager getManager() {
		return manager;
	}

	public void setManager(EmployeeManager manager) {
		this.manager = manager;
	}

	@RequestMapping(value="/home")
	public String homePage(ModelMap map){
		map.addAttribute("message", "List of Employees are as follows");
		map.addAttribute("employee", new Employee());
		map.addAttribute("empList", getManager().getAllEmployees());
		return "EmployeeList";
	}
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute(value="employee") Employee empDet,
								BindingResult result, ModelMap map){
		
		if(result.hasErrors()){
			return "EmployeeList";
		}
		
		Employee employee= new Employee();
		employee.setName(empDet.getName());
		getManager().addEmployee(employee);
		return "redirect:/home";
	}

}
