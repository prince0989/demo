package com.demo.service;

import com.demo.mapper.PersonMapper;
import com.demo.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> queryPerson(Integer age) {
        List<Person> list = personMapper.selectAll();
        List<Person> collect = list.stream()
                .filter(p -> p.getAge()>age)
                .collect(Collectors.toList());
        return collect;
    }
}
