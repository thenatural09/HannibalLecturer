package com.theironyard.entities;

import javax.persistence.*;

/**
 * Created by Troy on 10/27/16.
 */
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String author;

    @Column(nullable = false)
    String text;

    @Column(nullable = false)
    int lecturerId;

    @Column(nullable = false)
    boolean isGood;

    public Review(String author, String text, int lecturerId, boolean isGood) {
        this.author = author;
        this.text = text;
        this.lecturerId = lecturerId;
        this.isGood = isGood;
    }

    public Review() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
}
