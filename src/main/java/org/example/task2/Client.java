package org.example.task2;

import lombok.Getter;
import lombok.Setter;
import org.example.Gender;

public class Client {
    @Getter
    private int id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private Gender sex;

    private static int count = 0;

    public Client(String name, int age, Gender sex) {
        id = ++count;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
