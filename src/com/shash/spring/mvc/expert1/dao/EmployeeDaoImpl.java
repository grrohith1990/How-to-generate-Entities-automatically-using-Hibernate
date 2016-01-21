package com.shash.spring.mvc.expert1.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shash.spring.mvc.expert1.employeeVO.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	@Autowired
	private SessionFactory factory;
	
	
	
	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public void addEmployee(Employee employee) {
		getFactory().getCurrentSession().save(employee);
		
	}

	public List<Employee> getAllEmployees() {
		return getFactory().getCurrentSession().createQuery("from Employee").list();
	}

	public void deleteEmployee(int id) {
		getFactory().getCurrentSession().delete(getEmployee(id));
		
	}

	public Employee getEmployee(int id) {
		return (Employee)getFactory().getCurrentSession().get(Employee.class, id);
	}

	public int getEmployeeID(String name) {
		String hql = "select id from Employee where name=:ename";
		Query query = this.getFactory().getCurrentSession().createQuery(hql);
		query.setParameter("ename", name);	
		int id=-1;
		try{
			id=((Integer)query.uniqueResult()).intValue();
			System.out.println("id = "+id);
			return id;
		}
		catch(NullPointerException he){
			return id;
		}
	}


}
