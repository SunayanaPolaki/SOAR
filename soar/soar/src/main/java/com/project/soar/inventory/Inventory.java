package com.project.soar.inventory;

//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.CascadeType;

//import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Lob;
import javax.persistence.Table;

//import com.project.soar.orders.Orders;

@Entity
@Table(name="inventory")
public class Inventory {
	
	@Id
	@GeneratedValue
	@Column(name="inv_id")
	private Integer inv_id;
	
	@Column(name="inv_name")
	private String inv_name;
	
	@Column(name="inv_type")
	private String inv_type;
	
//	@Column(name="image")
//	private Blob image;
	
	@Column(name="inv_cost")
	private int inv_cost;
	

	@Column(name="inv_count")
	private int inv_count;
	
//	@OneToMany(mappedBy="inventory", cascade=CascadeType.ALL)
//	private Set<Orders> orders = new HashSet<>();
	
	protected Inventory() {}

	public Integer getInv_id() {
		return inv_id;
	}


	public void setInv_id(Integer inv_id) {
		this.inv_id = inv_id;
	}


	public String getInv_name() {
		return inv_name;
	}


	public void setInv_name(String inv_name) {
		this.inv_name = inv_name;
	}


	public String getInv_type() {
		return inv_type;
	}


	public void setInv_type(String inv_type) {
		this.inv_type = inv_type;
	}


	public int getInv_cost() {
		return inv_cost;
	}


	public void setInv_cost(int inv_cost) {
		this.inv_cost = inv_cost;
	}


	public int getInv_count() {
		return inv_count;
	}


	public void setInv_count(int inv_count) {
		this.inv_count = inv_count;
	}
		

}
