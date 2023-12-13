package com.example.miTrivia.entities;

import jakarta.persistence.*;
import lombok.Data;
//hibernete:

@Entity
@Table(name = "category")
@Data //hace getters, seters, TODO
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;




}
