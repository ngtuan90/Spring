package com.edwin.repository;

import java.util.List;

import com.edwin.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}