package com.hitema.projet.controllers;

import com.hitema.projet.entities.Customer;
import com.hitema.projet.services.CustomerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class CustomerController {
    private static final Logger log = LogManager.getLogger(CustomerController.class);

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public ModelAndView getCustomers() {
        log.trace("Appel des customers");
        List<Customer> customers = customerService.readAll();
        return new ModelAndView("customers","customers",customers);
    }
}
