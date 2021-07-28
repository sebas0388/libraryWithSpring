package com.init.app.Models;

import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table (name = "books")

public class bookModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;
		
	String name;
	Date publidate;
	String language;
	String editorial;
	String litgen;
	int price;
	String format;
	int stock;
	boolean active;
	
	@ManyToOne
	@JoinColumn(name = "id")
	@JsonBackReference
	
	private authorModel author;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPublidate() {
		return publidate;
	}
	public void setPublidate(Date publidate) {
		this.publidate = publidate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getLitgen() {
		return litgen;
	}
	public void setLitgen(String litgen) {
		this.litgen = litgen;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	

}
