package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.dao.CustomerDao;
import com.capgemini.dao.CustomerDaoImpl;
import com.capgemini.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDaoImpl customerDao;
	
	public CustomerDaoImpl getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDaoImpl customerDao) {
		this.customerDao = customerDao;
	}

	@Transactional
	public List<Customer> getAllCustomers() { 
		return customerDao.retrieveAllCustomers();
	}

	@Transactional
	public boolean addCustomer(Customer customer) {
		boolean result = customerDao.addCustomer(customer);
		return result;
	}
	
	@Transactional
	public boolean removeCustomer(Customer customer) {
		boolean result = customerDao.deleteCustomer(customer);
		return result;
	}

	@Transactional
	public Customer getOneCustomer(Customer customer) {
		return customerDao.retrieveCustomer(customer);
	}

	@Transactional
	public boolean modifyCustomer(Customer customer) {
		boolean result = customerDao.updateCustomer(customer);
		return result;
	}

	
}
