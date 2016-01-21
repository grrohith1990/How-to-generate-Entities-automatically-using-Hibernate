package com.shash.spring.mvc.expert1.manager;

import java.util.List;

import com.shash.spring.mvc.expert1.employeeVO.Employee;

public interface EmployeeManager {

	public void addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public void deleteEmployee(int id);
    public Employee getEmployee(int id);
    public int getEmployeeID(String name);
}
