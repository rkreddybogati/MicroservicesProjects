package com.rk.microservices.messaging.sender;

import com.rk.microservices.messaging.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by rbhogati on 1/12/17.
 */
@Service
public class RabbitMqMessageSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbit.routingkey}")
    private String routingKey;

    public void send(Employee employee) {
        rabbitTemplate.convertAndSend(exchange, routingKey, employee);
    }
}
