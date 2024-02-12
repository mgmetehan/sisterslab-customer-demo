package com.sisterslab.sisterslabcustomer.controller;

import com.sisterslab.sisterslabcustomer.model.Customer;
import com.sisterslab.sisterslabcustomer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping()
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);

    }

}
