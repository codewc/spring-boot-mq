package com.fadu.springboot.rabbit.many;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fadu")
public class NeoReceiver1 {

    @RabbitHandler
    public void process(String neo) {
        System.out.println("Receiver 1: " + neo);
    }

}
