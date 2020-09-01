package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/person")
@CrossOrigin("*")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/add")
    public UUID add(@Valid @RequestBody Person person) {
        return personService.add(person);
    }

    @GetMapping("/get_all")
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping("/get")
    public Person get(@RequestParam UUID id) {
        return personService.get(id).orElse(null);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam UUID id) {
        personService.delete(id);
    }

    @PutMapping("/update")
    public void update(@Valid @RequestBody Person person) {
        personService.update(person.getId(), person);
    }

}

