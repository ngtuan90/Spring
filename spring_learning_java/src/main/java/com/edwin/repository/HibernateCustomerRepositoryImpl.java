package com.edwin.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.edwin.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	/* (non-Javadoc)
	 * @see com.edwin.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Edwin");
		customer.setLastname("Nguyen");
		
		customers.add(customer);
		
		return customers;
	}
}
