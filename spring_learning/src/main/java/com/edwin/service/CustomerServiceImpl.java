package com.edwin.service;

import java.util.List;

import com.edwin.model.Customer;
import com.edwin.repository.CustomerRepository;
import com.edwin.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepositoryRepository = new HibernateCustomerRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.edwin.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepositoryRepository.findAll();
	}
}
