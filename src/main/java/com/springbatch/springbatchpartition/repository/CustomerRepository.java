package com.springbatch.springbatchpartition.repository;

import com.springbatch.springbatchpartition.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
