package com.team5.quanlybanhang.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "order_details")
public class Order_details {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne() // mối quan hệ
	@JoinColumn(name = "product_id")
	private Product product;

	@ManyToOne() // mối quan hệ
	@JoinColumn(name = "order_id")
	private Orders orders;

	@Column(name = "price")
	private Float Price;
	@Column(name = "number")
	private Float Number;
	@Column(name = "total_money")
	private Float Total_money;

	public Order_details() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Orders getOrder() {
		return orders;
	}

	public void setOrder(Orders orders) {
		this.orders = orders;
	}

	public Float getPrice() {
		return Price;
	}

	public void setPrice(Float price) {
		Price = price;
	}

	public Float getNumber() {
		return Number;
	}

	public void setNumber(Float number) {
		Number = number;
	}

	public Float getTotal_money() {
		return Total_money;
	}

	public void setTotal_money(Float total_money) {
		Total_money = total_money;
	}

}
