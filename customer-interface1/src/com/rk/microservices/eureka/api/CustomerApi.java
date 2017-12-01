package com.rk.microservices.eureka.api;

import com.rk.microservices.eureka.model.Customer;

/**
 * Created by rbhogati on 23/11/17.
 */
public interface CustomerApi {


    public Customer getCustomer(int id);

    /*public Customer getCustomer(int id) {

        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("RK");
        customer.setAddress("Bangalore");

        return customer;
    }*/

}
