package io.github.luizimcpi.booksfargateapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Book {

    private final long id;
    private final String name;
    private final String author;

}
