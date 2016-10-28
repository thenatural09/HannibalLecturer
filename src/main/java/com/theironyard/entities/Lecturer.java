package com.theironyard.entities;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

/**
 * Created by Troy on 10/27/16.
 */
@Entity
@Table(name = "lecturers")
public class Lecturer {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false,unique = true)
    String name;

    @Column(nullable = false)
    String topic;

    @Column(nullable = false)
    String image;

    public Lecturer(String name, String topic, String image) {
        this.name = name;
        this.topic = topic;
        this.image = image;
    }
}
