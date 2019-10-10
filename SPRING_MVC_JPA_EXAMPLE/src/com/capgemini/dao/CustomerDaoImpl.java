package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.model.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public boolean addCustomer(Customer customer) {
		
		entityManager.persist(customer);
		
		return true;
	}

	public boolean deleteCustomer(Customer customer) {
		Query query = entityManager.createNamedQuery("delete");
		query.setParameter("cid", customer.getId());
		int result = query.executeUpdate();
		if(result == 1)
			return true;
		else 
			return false;
		
	}

	public boolean updateCustomer(Customer customer) {
		Query query = entityManager.createNamedQuery("update");
		query.setParameter("cid", customer.getId());
		query.setParameter("cname", customer.getName());
		query.setParameter("cemail", customer.getEmail());
		query.setParameter("caddress", customer.getAddress());
		
		int result = query.executeUpdate();
		if(result==1)
			return true;
		else
			return false;
	}

	public Customer retrieveCustomer(Customer customer) {
		Query query = entityManager.createNamedQuery("findById");
		query.setParameter("cid", customer.getId());
		List<Customer> list = query.getResultList();
		return list.get(0);
	}

	public List<Customer> retrieveAllCustomers() {
		TypedQuery<Customer> tquery = entityManager.createQuery("From Customer", Customer.class);
		List<Customer> list = tquery.getResultList();
		return list;
		
		
	}

	


	
	
	
}
