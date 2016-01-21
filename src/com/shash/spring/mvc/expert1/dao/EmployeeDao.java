package com.shash.spring.mvc.expert1.dao;

import java.util.List;

import com.shash.spring.mvc.expert1.employeeVO.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(int id);
    public Employee getEmployee(int id);
    public int getEmployeeID(String name);
}
