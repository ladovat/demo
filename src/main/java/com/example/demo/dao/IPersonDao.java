package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IPersonDao {

    int create(UUID id, Person person);

    default UUID create(Person person) {
        final UUID id = UUID.randomUUID();
        create(id, person);
        return id;
    }

    int delete(UUID id);

    int update(UUID id, Person person);

    Optional<Person> get(UUID id);

    List<Person> getAll();
}
