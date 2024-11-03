package com.AshuBoi.SpringBoot.Learn_Jpa_Hibernate.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1,"Learn Aws","AshuBoi"));
//        repository.insert(new Course(2,"Learn Java","AshuBoi"));
//        repository.insert(new Course(3,"Learn Spring","AshuBoi"));
        repository.save(new Course(1,"Learn Aws","AshuBoi"));
        repository.save(new Course(2,"Learn Java","AshuBoi"));
        repository.save(new Course(3,"Learn Spring","AshuBoi"));
        long id = 1;
        repository.deleteById(id);
        long id2 = 2;
        System.out.println(repository.findById(id2));
        System.out.println(repository.findById(++id2));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("AshuBoi"));
        System.out.println(repository.findByAuthor(""));

        System.out.println(repository.findByName("Learn Spring"));
    }
}
// difference between Spring Data Jpa and other are repository is an interface
// and instead of repository.insert its repository.save
