package com.theironyard.services;

import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Troy on 10/27/16.
 */
public interface ReviewRepository extends CrudRepository<Review,Integer> {
}
