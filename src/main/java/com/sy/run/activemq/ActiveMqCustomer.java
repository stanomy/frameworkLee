package com.sy.run.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * mq消费类
 * Created by yy on 2017/9/1.
 */
@Component
public class ActiveMqCustomer {


    @JmsListener(destination = "sy.test.mq")
    public void receiveQueue(String msg) {

        System.out.println("receive s msg,=" + msg);

    }
}
