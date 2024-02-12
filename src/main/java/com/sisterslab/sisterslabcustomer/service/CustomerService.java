package com.sisterslab.sisterslabcustomer.service;

import com.sisterslab.sisterslabcustomer.model.Customer;
import com.sisterslab.sisterslabcustomer.respository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
