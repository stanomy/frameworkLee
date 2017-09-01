package com.sy.run.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.List;

/**
 * Created by yy on 2017/8/30.
 */
@ServletComponentScan(basePackages = "com.sy")
@SpringBootApplication
public class UserMongodbRun implements CommandLineRunner {

    @Autowired
    private PersonRepository repository;


    public static void main(String[] args) {
        SpringApplication.run(UserMongodbRun.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        for (int i = 0; i < 10; i++) {
            repository.save(new Person("程老师" + i, "一千除以4", 20 + i, "成都"));

        }


        List<Person> personList = repository.findAll();

        System.out.println("开始查询,size=" + personList.size());

        for (Person p : personList) {
            System.out.println(p.print());
        }
    }
}
