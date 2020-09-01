package com.example.demo.service;

import com.example.demo.dao.IPersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final IPersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("h2") IPersonDao personDao) {
        this.personDao = personDao;
    }

    public UUID add(Person person) {
        return this.personDao.create(person);
    }

    public List<Person> getAll() {
        return this.personDao.getAll();
    }

    public Optional<Person> get(UUID id) {
        return this.personDao.get(id);
    }

    public int delete(UUID id) {
        return this.personDao.delete(id);
    }

    public int update(UUID id, Person person) {
        return this.personDao.update(id, person);
    }
}
