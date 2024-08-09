package com.data.functionalProgramming.imperative;

import java.util.List;
import java.util.function.Predicate;

import static com.data.functionalProgramming.imperative.Main.Gender.FEMALE;
import static com.data.functionalProgramming.imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Tim", MALE),
                new Person("Joshua", MALE),
                new Person("Rachel", FEMALE),
                new Person("Hannah", FEMALE)
        );

        //predicate
        //accepts one input and returns a boolean value
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        people.stream().filter(personPredicate)
                .forEach(System.out::println);
    }


    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
