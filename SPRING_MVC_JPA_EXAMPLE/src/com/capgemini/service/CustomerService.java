package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomers();
	public boolean addCustomer(Customer customer);
	public boolean removeCustomer(Customer customer);
	public Customer getOneCustomer(Customer customer);
	public boolean modifyCustomer(Customer customer);
}
