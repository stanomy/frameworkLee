package com.sy.run.activemq;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
/**
 * Created by yy on 2017/9/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestActiveMq {


    @Rule
    public OutputCapture outputCapture=new OutputCapture();

    @Autowired
    private ActiveMqProducer producer;


    @Test
    public void sendMqMsgTest() throws InterruptedException {
        this.producer.send("test msg");
        Thread.sleep(1000);
        assertThat(this.outputCapture.toString().contains("test msg")).isTrue();
    }
}
