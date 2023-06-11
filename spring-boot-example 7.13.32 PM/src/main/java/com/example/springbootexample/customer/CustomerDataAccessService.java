package com.example.springbootexample.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao {

    private static List<Customer> customerList;

    static {
        customerList = new ArrayList<>();

        Customer alex = new Customer(
                1,
                "Alex",
                "alex@gmail.com",
                22
        );
        customerList.add(alex);

        Customer jamila = new Customer(
                2,
                "Jamila",
                "jamila@gmail.com",
                22
        );
        customerList.add(jamila);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customerList;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customerList.stream()
                .filter(customer -> Objects.equals(customer.getId(), id))
                .findFirst();

    }
}
