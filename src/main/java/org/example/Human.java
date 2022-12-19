package org.example;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Human {
    private String name;
    private int age;
    private Gender gender;
}
