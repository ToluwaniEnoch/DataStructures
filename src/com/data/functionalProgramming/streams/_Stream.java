package com.data.functionalProgramming.streams;

import java.util.List;

import static com.data.functionalProgramming.streams._Stream.Gender.FEMALE;
import static com.data.functionalProgramming.streams._Stream.Gender.MALE;


public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Tim", MALE),
                new Person("Joshua", MALE),
                new Person("Rachel", FEMALE),
                new Person("Hannah", FEMALE)
        );
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
