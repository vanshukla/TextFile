package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


/*@NamedQueries({
	@NamedQuery(name="delete", query="Delete from CUSTOMER c Where c.id = :cid"),
	@NamedQuery(name="update", query="Update CUSTOMER c Set c.name = :cname, c.email = :cemail, c.address = :caddress"),
	@NamedQuery(name="findById", query="Select c from CUSTOMER c Where c.id = :cid")
})*/
/*@Component*/
@Entity
@Table(name="CUSTOMER")
@NamedQueries({
	@NamedQuery(name="delete", query="Delete from Customer c where c.id= :cid"),
	@NamedQuery(name="update", query="Update Customer c set c.name = :cname , c.email = :cemail , c.address = :caddress where c.id = :cid"),
	@NamedQuery(name="findById", query="Select c From Customer c where c.id= :cid")
})
public class Customer {
	
	
	/*	@GeneratedValue(strategy = GenerationType.IDENTITY)*/
	@Id
	@Column(name="CUST_ID")
	private long id;
	
	
	@Column(name="CUST_NAME")
	@NotEmpty(message ="Customer name is required.")
	@Size(min=3, max=20, message="Customer name should be min 3 to max 20 character long.")
	private String name;
	
	@Column(name="CUST_EMAIL")
	@NotEmpty(message ="Customer email is required.")
	private String email;
	
	@Column(name="CUST_ADDRESS")
	@NotEmpty(message ="Customer address is required.") //no size is mentioned here.
	private String address;
	
	
	public Customer() {
	}
	
	public Customer(long id, String name, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}
	
	
}
