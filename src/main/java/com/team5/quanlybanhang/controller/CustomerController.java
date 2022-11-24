package com.team5.quanlybanhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team5.quanlybanhang.entity.Customer;
import com.team5.quanlybanhang.service.BaseService;

@Controller
@RequestMapping("/basecustomer")
public class CustomerController {
	
	@Autowired
    private BaseService<Customer> customerService;
}
