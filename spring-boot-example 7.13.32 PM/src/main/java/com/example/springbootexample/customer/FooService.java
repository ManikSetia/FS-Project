package com.example.springbootexample.customer;

import com.example.springbootexample.SpringBootExampleApplication;
import org.springframework.stereotype.Service;

@Service
public class FooService {

    private SpringBootExampleApplication.Foo foo;

    public FooService(SpringBootExampleApplication.Foo foo) {
        this.foo = foo;
    }

    String getFooName() {
       return this.foo.name();
    }
}
