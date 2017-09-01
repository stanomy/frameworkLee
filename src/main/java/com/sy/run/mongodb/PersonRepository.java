package com.sy.run.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by yy on 2017/8/30.
 */
public interface PersonRepository extends MongoRepository<Person, String> {

    public Person findPersonByName();

//    public Person addPerson(Person person);

    public List<Person> findAll();

//    public List<Person> findAllByAge(int age);
}
