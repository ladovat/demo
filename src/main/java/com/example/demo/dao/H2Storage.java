package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("h2")
public class H2Storage implements IPersonDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public H2Storage(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int create(UUID id, Person person) {
        String strSql = "INSERT INTO person (id, name, age) VALUES (?, ?, ?)";
        return jdbcTemplate.update(strSql, id.toString(), person.getName(), person.getAge());
    }

    @Override
    public int delete(UUID id) {
        String strSql = "DELETE FROM person WHERE id = ?";
        return this.jdbcTemplate.update(strSql, id.toString());
    }

    @Override
    public int update(UUID id, Person person) {
        String strSql = "UPDATE person SET name = ?, age = ? WHERE id = ?";

        return this.jdbcTemplate.update(strSql, person.getName(), person.getAge(), id.toString());
    }

    @Override
    public Optional<Person> get(UUID id) {
        String strSql = "SELECT id, name, age FROM person WHERE id = ?";
        Person person = this.jdbcTemplate.queryForObject(strSql, new Object[]{id}, (resultSet, i) ->
                new Person(
                        UUID.fromString(resultSet.getString("id")),
                        resultSet.getString("name"),
                        resultSet.getInt("age")
                ));

        return Optional.ofNullable(person);
    }

    @Override
    public List<Person> getAll() {
        String strSql = "SELECT id, name, age FROM person";
         return this.jdbcTemplate.query(strSql, (resultSet, i) ->
                new Person(
                        UUID.fromString(resultSet.getString("id")),
                        resultSet.getString("name"),
                        resultSet.getInt("age")
                ));
    }
}
