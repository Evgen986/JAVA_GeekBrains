package org.example.seminar3.HW3;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {
    private String nameBook;
    private String author;
    private Integer price;
    private Integer year;
    private Integer pages;
}
