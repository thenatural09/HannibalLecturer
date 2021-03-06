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

    public Lecturer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
