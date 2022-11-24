package com.team5.quanlybanhang.entity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;



@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "sex")
    private String sex;
	@Column(name = "phone")
    private String phone;
	@Column(name = "email")
    private String email;
	
	@Column(name = "birthday")
	private Timestamp birthday;
	
	@Column(name = "address")
    private String address;
	
	@Column(name = "password")
    private String password;
	@OneToMany(mappedBy = "customer")
	private List<Role> role;
	@Column(name = "create_at")
	private Timestamp create_at;
	@Column(name = "update_at")
	private Timestamp update_at;
	@Column(name = "delete_status")
	private Timestamp delete_status;
	@OneToOne(mappedBy = "customer")
    private Orders orders;
		public Customer() {
		super();
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Timestamp getBirthday() {
			return birthday;
		}
		public void setBirthday(Timestamp birthday) {
			this.birthday = birthday;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public List<Role> getRole() {
			return role;
		}
		public void setRole(List<Role> role) {
			this.role = role;
		}
		public Timestamp getCreate_at() {
			return create_at;
		}
		public void setCreate_at(Timestamp create_at) {
			this.create_at = create_at;
		}
		public Timestamp getUpdate_at() {
			return update_at;
		}
		public void setUpdate_at(Timestamp update_at) {
			this.update_at = update_at;
		}
		public Timestamp getDelete_status() {
			return delete_status;
		}
		public void setDelete_status(Timestamp delete_status) {
			this.delete_status = delete_status;
		}
		public Orders getOrder() {
			return orders;
		}
		public void setOrder(Orders orders) {
			this.orders = orders;
		}
	
	
}
