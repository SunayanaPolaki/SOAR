package com.project.soar.orders;

import java.util.Date;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.project.soar.employee.Employee;
//import com.project.soar.inventory.Inventory;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue
	@Column(name="order_id")
	private Integer order_id;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="inventory_id", referencedColumnName="inv_id")
//	private Inventory inventory;
	
	@Column(name="inventory_id")
	private int inventory_id;
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="employee_id", referencedColumnName="emp_id")
//	private Employee employee;
	
	@Column(name="employee_id")
	private String employee_id;

	@Column(name="sd_remark")
	private String sd_remark;
	
	@Column(name="m_remark")
	private String m_remark;
	
	@Column(name="order_datetime")
	private Date order_datetime;
	
	@Column(name="status")
	private String status;
	
	public Order() {}

	public Integer getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getSd_remark() {
		return sd_remark;
	}

	public void setSd_remark(String sd_remark) {
		this.sd_remark = sd_remark;
	}

	public String getM_remark() {
		return m_remark;
	}

	public void setM_remark(String m_remark) {
		this.m_remark = m_remark;
	}

	public Date getOrder_datetime() {
		return order_datetime;
	}

	public void setOrder_datetime(Date order_datetime) {
		this.order_datetime = order_datetime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
