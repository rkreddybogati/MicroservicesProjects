package com.rk.microservices.messaging.controller;

import com.rk.microservices.messaging.model.Employee;
import com.rk.microservices.messaging.receiver.RabbitMqMessageReceiver;
import com.rk.microservices.messaging.sender.RabbitMqMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rbhogati on 1/12/17.
 */
@RestController
@RequestMapping("/send-message")
public class RabbitMQWebController {

    @Autowired
    RabbitMqMessageSender messageSender;

    @Autowired
    RabbitMqMessageReceiver messageReceiver;

    @RequestMapping("/produce")
    public String produce(){

        Employee employee = new Employee();
        employee.setEmpId("001");
        employee.setEmpName("RkReddy");

        messageSender.send(employee);

        return "Message sent to the RabbitMQ JavaInUse Successfully";
    }

    @RequestMapping("/consume")
    public String consume() {
        return  messageReceiver.recieve();
    }


}
