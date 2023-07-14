package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@ApiModelProperty(position = 1)
	private int id;
	
	@Column(name = "Product_Name",nullable = true)
	@ApiModelProperty(position = 2)
	private String productName;
	
	@Column(name="Product_Price",nullable = true)
	@ApiModelProperty(position = 3)
	private long productPrice;
	
	@Column(name = "Product_Quentity",nullable = true)
	@ApiModelProperty(position = 4)
	private int productQuentity;

}
