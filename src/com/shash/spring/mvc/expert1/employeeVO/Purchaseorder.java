package com.shash.spring.mvc.expert1.employeeVO;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the purchaseorder database table.
 * 
 */
@Entity
@NamedQuery(name="Purchaseorder.findAll", query="SELECT p FROM Purchaseorder p")
public class Purchaseorder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int purchaseOrderId;

	private int employee_EmployeeID;

	private String purchaseOrderName;

	public Purchaseorder() {
	}

	public int getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public int getEmployee_EmployeeID() {
		return this.employee_EmployeeID;
	}

	public void setEmployee_EmployeeID(int employee_EmployeeID) {
		this.employee_EmployeeID = employee_EmployeeID;
	}

	public String getPurchaseOrderName() {
		return this.purchaseOrderName;
	}

	public void setPurchaseOrderName(String purchaseOrderName) {
		this.purchaseOrderName = purchaseOrderName;
	}

}