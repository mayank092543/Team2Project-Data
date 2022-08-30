package com.bah.mcc.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.bah.mcc.security.domain.Customer;

public interface CustomersRepository extends CrudRepository<Customer, Long> {
	

}
