package com.simplon.ldvelhdccf.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Book")
@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "author")
    private String author;
    @ElementCollection(targetClass = Type.class)
    @CollectionTable(name = "BookType",
            joinColumns = @JoinColumn(name = "BookId"))
    @Enumerated(EnumType.STRING)
    @Column(name = "TypeName")
    private Set<Type> type;

}
