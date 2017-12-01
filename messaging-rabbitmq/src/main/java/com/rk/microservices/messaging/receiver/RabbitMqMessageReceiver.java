package com.rk.microservices.messaging.receiver;

import com.rk.microservices.messaging.model.Employee;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by rbhogati on 1/12/17.
 */
@Service
public class RabbitMqMessageReceiver {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${rabbit.queue}")
    String queue;

    public String recieve() {
        Object object = rabbitTemplate.receiveAndConvert(queue);
        Employee employee = (Employee) object;
        return employee.getEmpId()+employee.getEmpName();
    }
}
