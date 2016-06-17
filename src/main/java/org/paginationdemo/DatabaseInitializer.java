package org.paginationdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.paginationdemo.domain.Person;
import org.paginationdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

    private PersonService personService;

    @Autowired
    public DatabaseInitializer(PersonService studentService) {
        this.personService = studentService;
    }

    @PostConstruct
    public void populateDatabase() {
        Person firstPerson = new Person("Barack", "Obama", 40);
        Person secondPerson = new Person("Vladimir", "Putin", 50);
        Person thirdPerson = new Person("Jong", "Kim Un", 30);
        Person fourthPerson = new Person("Angela", "Merkel", 60);
        Person fifthPerson = new Person("David", "Cameron", 60);
        Person sixthPerson = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson1 = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson2 = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson3 = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson5 = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson6 = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson7 = new Person(" Alexander", "Lukashenko", 60);
        Person sixthPerson8 = new Person(" Alexander", "Lukashenko", 60);
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            list.add(new Person(" Alexander", "Lukashenko", 60));

        }
        personService.save(list);
    }

}
