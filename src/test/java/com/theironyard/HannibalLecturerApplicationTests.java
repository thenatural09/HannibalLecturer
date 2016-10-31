package com.theironyard;

import com.theironyard.services.LecturerRepository;
import com.theironyard.services.ReviewRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HannibalLecturerApplicationTests {
	@Autowired
	ReviewRepository reviews;

	@Autowired
	LecturerRepository lecturers;

	@Autowired
	WebApplicationContext wac;

	MockMvc mockMvc;

	@Before
	public void before() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void aAddLecturer() throws Exception {
		mockMvc.perform(
				MockMvcRequestBuilders.post("/lecturers")
					.param("name","Troy")
					.param("topic","Baseball")
					.param("image","Image")
		);
		Assert.assertTrue(lecturers.count() == 1);
	}

	@Test
	public void bAddReview() throws Exception {
		mockMvc.perform(
				MockMvcRequestBuilders.post("/reviews")
					.param("author","Bob")
					.param("isGood","True")
					.param("text","Hello")
					.param("lecturerId","1")
		);
		Assert.assertTrue(reviews.count() == 1);
	}
}
