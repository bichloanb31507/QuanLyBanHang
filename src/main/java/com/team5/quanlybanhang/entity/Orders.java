package com.team5.quanlybanhang.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders") 
public class Orders {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String Name;
	
	@Column(name="email")
    private String Email;
	
	@Column(name="phone")
    private String Phone;
	
	@Column(name="address")
    private String Address;
	
	@Column(name="order_date")
    private Timestamp Order_date;
	
	@Column(name="status")
    private int Status;
	
	@Column(name="total_money")
    private Float Total_money;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
	
	@OneToMany(mappedBy = "orders")
	private List<Order_details> order_details;

	public Orders() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Timestamp getOrder_date() {
		return Order_date;
	}

	public void setOrder_date(Timestamp order_date) {
		Order_date = order_date;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public Float getTotal_money() {
		return Total_money;
	}

	public void setTotal_money(Float total_money) {
		Total_money = total_money;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Order_details> getOrder_details() {
		return order_details;
	}

	public void setOrder_details(List<Order_details> order_details) {
		this.order_details = order_details;
	}
	
	

	
}
