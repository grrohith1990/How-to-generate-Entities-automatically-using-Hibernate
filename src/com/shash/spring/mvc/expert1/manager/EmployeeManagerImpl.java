package com.shash.spring.mvc.expert1.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shash.spring.mvc.expert1.dao.EmployeeDao;
import com.shash.spring.mvc.expert1.employeeVO.Employee;

@Service
@Transactional
public class EmployeeManagerImpl implements EmployeeManager {
	@Autowired
	private EmployeeDao dao;
	
	

	public EmployeeDao getDao() {
		return dao;
	}

	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	public void addEmployee(Employee employee) {
		getDao().addEmployee(employee);
		
	}

	public List<Employee> getAllEmployees() {
		return getDao().getAllEmployees();
	}

	public void deleteEmployee(int id) {
		 
		getDao().deleteEmployee(id);
		
	}

	public Employee getEmployee(int id) {
		return getDao().getEmployee(id);
	}

	public int getEmployeeID(String name) {
		return getDao().getEmployeeID(name);
	}

	

}
