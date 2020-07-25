package com.demo.service;

import com.demo.pojo.Person;

import java.util.List;

public interface PersonService {
    List<Person> queryPerson(Integer age);
}
