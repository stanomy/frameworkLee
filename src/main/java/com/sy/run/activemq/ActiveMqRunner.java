package com.sy.run.activemq;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * Created by yy on 2017/9/1.
 */
@SpringBootApplication
@EnableJms
public class ActiveMqRunner {


    @Bean
    public Queue queue() {
        return new ActiveMQQueue("sy.test.mq");
    }

    public static void main(String[] args) {
        SpringApplication.run(ActiveMqRunner.class, args);
    }
}
