package org.example;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
public class User {
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;
}
