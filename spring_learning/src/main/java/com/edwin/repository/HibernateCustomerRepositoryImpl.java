package com.edwin.repository;

import java.util.ArrayList;
import java.util.List;

import com.edwin.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.edwin.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Edwin");
		customer.setLastname("Nguyen");
		
		customers.add(customer);
		
		return customers;
	}
}
