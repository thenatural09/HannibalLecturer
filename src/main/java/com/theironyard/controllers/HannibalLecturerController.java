package com.theironyard.controllers;

import com.theironyard.entities.Lecturer;
import com.theironyard.entities.Review;
import com.theironyard.services.LecturerRepository;
import com.theironyard.services.ReviewRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by Troy on 10/27/16.
 */
@RestController
public class HannibalLecturerController {
    @Autowired
    LecturerRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers",method = RequestMethod.POST)
    public Lecturer addLecturer (String name,String topic,String image) {
        Lecturer lecturer = new Lecturer(name,topic,image);
        return lecturers.save(lecturer);
    }

    @RequestMapping(path = "/reviews",method = RequestMethod.POST)
    public Review addReview (String author, boolean isGood, String text,Integer lecturerId) {
        Lecturer lecturer = lecturers.findOne(lecturerId);
        Review review = new Review(author,text,isGood,lecturer);
        return reviews.save(review);
    }

    @RequestMapping(path = "/lecturers",method = RequestMethod.GET)
    public Iterable<Lecturer> getLecturers() {
        return lecturers.findAll();
    }

    @RequestMapping(path = "/reviews",method = RequestMethod.GET)
    public Iterable<Review> getReviews () {
        return reviews.findAll();
    }
}
