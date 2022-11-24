package com.team5.quanlybanhang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.quanlybanhang.entity.Customer;
import com.team5.quanlybanhang.repository.BaseRepository;

@Service
public class CustomerService implements BaseService<Customer> {

    @Autowired
    private BaseRepository<Customer> customerRepository;
    
    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void saveOrUpdate(Customer customer) {
        customerRepository.saveOrUpdate(customer);
    }

    @Override
    public Customer get(int id) {
        return customerRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        customerRepository.deleteById(id);
    }
}
