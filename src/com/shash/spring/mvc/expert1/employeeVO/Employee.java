package com.shash.spring.mvc.expert1.employeeVO;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeID;

	private String age;

	private String name;

	//bi-directional many-to-one association to Purchaseorder
	@OneToMany(mappedBy="employee")
	private List<Purchaseorder> purchaseorders;

	public Employee() {
	}

	public int getEmployeeID() {
		return this.employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Purchaseorder> getPurchaseorders() {
		return this.purchaseorders;
	}

	public void setPurchaseorders(List<Purchaseorder> purchaseorders) {
		this.purchaseorders = purchaseorders;
	}

	public Purchaseorder addPurchaseorder(Purchaseorder purchaseorder) {
		getPurchaseorders().add(purchaseorder);
		purchaseorder.setEmployee(this);

		return purchaseorder;
	}

	public Purchaseorder removePurchaseorder(Purchaseorder purchaseorder) {
		getPurchaseorders().remove(purchaseorder);
		purchaseorder.setEmployee(null);

		return purchaseorder;
	}

}