package com.sisterslab.sisterslabcustomer.respository;

import com.sisterslab.sisterslabcustomer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
