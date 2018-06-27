package com.neo.rabbit.sms;

import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangchun
 * @Date: 2018/6/27 10:56
 */
@Component
@RabbitListener(queues = "sms", containerFactory = "rabbitListenerContainerFactory")
public class SMSReceiver {

    private Logger logger = LoggerFactory.getLogger(SMSReceiver.class);

    @RabbitHandler
    public void process(String msg, Channel channel, @Header(AmqpHeaders.DELIVERY_TAG) long tag) throws Exception{
        logger.info(msg);
        channel.basicAck(tag, false);
    }
}