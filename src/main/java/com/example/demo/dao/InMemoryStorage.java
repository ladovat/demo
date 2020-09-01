package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class InMemoryStorage implements IPersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int create(UUID id, Person person) {
        DB.add(new Person(id, person.getName(), person.getAge()));
        return 1;
    }

    @Override
    public int delete(UUID id) {
        Optional<Person> personMaybe = get(id);

        if (personMaybe.isPresent()){
            return 0;
        }

        DB.remove(personMaybe.get());
        return 1;
    }

    @Override
    public int update(UUID id, Person person) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Optional<Person> get(UUID id) {
        return DB.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public List<Person> getAll() {
        return DB;
    }
}
