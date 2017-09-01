package com.sy.run.mongodb;

import org.springframework.data.annotation.Id;

/**
 * Created by yy on 2017/8/30.
 */
public class Person {

    @Id
    private String name;
    private String nickName;
    private int age;
    private String address;


    public Person(){}
    public Person(String name,String nickName,int age,String address){
        this.address=address;
        this.age=age;
        this.nickName=nickName;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String print(){
        return String.format(
                "Person[name=%s, nickName='%s', address='%s',age='%d']",
                name, nickName, address,age);
    }
}
