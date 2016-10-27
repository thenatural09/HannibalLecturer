package com.theironyard.services;

import com.theironyard.entities.Lecturer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Troy on 10/27/16.
 */
public interface LecturerRepository extends CrudRepository<Lecturer,Integer> {
}
