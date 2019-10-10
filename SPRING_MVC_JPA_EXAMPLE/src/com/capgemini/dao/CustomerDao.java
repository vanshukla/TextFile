package com.capgemini.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Customer;


public interface CustomerDao {
	public boolean addCustomer(Customer customer);
	public boolean deleteCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public Customer retrieveCustomer(Customer customer);
	public List<Customer> retrieveAllCustomers();
}
