package com.enigma.enigma.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "stock", schema = "enigma")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private int price;
	private int val;

	public Stock(int id, String name, String type, int price, int val) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
		this.val = val;
	}

	public Stock() {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getValues() {
		return val;
	}

	public void setValues(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", val=" + val
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getType()=" + getType() + ", getPrice()="
				+ getPrice() + ", getValues()=" + getValues() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
