package com.sy.run.activemq;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.Random;

/**
 * mq生产者
 * Created by yy on 2017/9/1.
 */
@Component
public class ActiveMqProducer implements CommandLineRunner {


    @Autowired
    private JmsMessagingTemplate template;

    @Autowired
    private Queue queue;

    @Override
    public void run(String... strings) throws Exception {
        String msg = "send a msg";
        send(msg);
        System.out.println("Message was sent to the Queue,msg=" + msg);
    }


    public void send(String msg) {
        template.convertAndSend(queue, msg);
    }
}
