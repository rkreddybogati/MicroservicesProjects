package com.rk.microservices.eureka.api;

import com.rk.microservices.eureka.model.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rbhogati on 23/11/17.
 */
public interface CustomerApi {

    @RequestMapping(value = "/customer/{id}" , method = RequestMethod.GET, produces = "application/json")
    public Customer getCustomer(@PathVariable("id") int id);

    /*public Customer getCustomer(int id) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("RK");
        customer.setAddress("Bangalore");
        return customer;
    }*/

}
