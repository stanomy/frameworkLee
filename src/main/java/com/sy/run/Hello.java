package com.sy.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yy on 2017/8/29.
 */
@RestController
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/hello")
    @ResponseBody
    String world(){
        return "Hello wrold";
    }

    public static void main(String[] args){
        SpringApplication.run(Hello.class,args);
    }
}
