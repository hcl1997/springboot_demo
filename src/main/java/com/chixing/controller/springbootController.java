package com.chixing.controller;

import com.chixing.entity.Customer;
import com.chixing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class springbootController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("getById")
    @ResponseBody
    public Customer getById(){
        return customerService.getById(101);
    }
}
