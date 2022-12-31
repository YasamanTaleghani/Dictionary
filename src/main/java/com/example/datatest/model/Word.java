package com.example.datatest.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Elementary")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
    @Column(name = "word", nullable = false)
    private String word;
    @Column(name = "meaning", nullable = false)
    private String meaning;
    @Column(name = "type", nullable = false)
    private String type;
    private String example;
}
