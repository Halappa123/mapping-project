package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
//	@GeneratedValue(generator = "system-uuid")
//    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(hidden = true,notes = "unique id",position = 1)
	private int id;
	
	@Column(name = "Customer_Name",nullable = true)
	@ApiModelProperty(position = 2)
	private String customerName;
	
	@Column(name = "Customer_Email",nullable = true)
	@ApiModelProperty(position = 3)
	private String customerEmail;
	
	@Column(name = "Customer_Gender",nullable = true)
	@ApiModelProperty(position = 4)
	private String customerGender;
	
	@Column(name = "Customer_PhNo",nullable = true)
	@ApiModelProperty(position = 5)
	private long customerPhNo;
	
	@ApiModelProperty(position = 6)
	@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "Custome_Product_fk",referencedColumnName = "id")
	private List<Product> products;

}
