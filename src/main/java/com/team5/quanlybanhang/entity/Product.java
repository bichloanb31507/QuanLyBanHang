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
@Table(name="product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
    private String Name;
	
	@Column(name="price")
    private Float Price;
	
	@Column(name="discount")
    private Float Discount;
	
	@Column(name="thumbnail")
    private String Thubnail;
	
	@Column(name="description")
    private String Description;
	
	@Column(name="delete_status")
	private int Delete_status;
	
	 @ManyToOne ()//mối quan hệ
		@JoinColumn(name="category_id")
		private Category category;

	 @OneToMany(mappedBy = "product")
		private List<Galery> galery;
	 @OneToMany(mappedBy = "product")
		private List<Order_details> order_details;

	public Product() {
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

	public Float getPrice() {
		return Price;
	}

	public void setPrice(Float price) {
		Price = price;
	}

	public Float getDiscount() {
		return Discount;
	}

	public void setDiscount(Float discount) {
		Discount = discount;
	}

	public String getThubnail() {
		return Thubnail;
	}

	public void setThubnail(String thubnail) {
		Thubnail = thubnail;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getDelete_status() {
		return Delete_status;
	}

	public void setDelete_status(int delete_status) {
		Delete_status = delete_status;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Galery> getGalery() {
		return galery;
	}

	public void setGalery(List<Galery> galery) {
		this.galery = galery;
	}

	public List<Order_details> getOrder_details() {
		return order_details;
	}

	public void setOrder_details(List<Order_details> order_details) {
		this.order_details = order_details;
	}
	 
	 
}
