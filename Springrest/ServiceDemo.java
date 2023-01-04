package com.springrest.Springrst.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.Springrst.entity.Course;

public interface ServiceDemo {
	public List<Course> getCourses();
	public Course singleCourse( long cid) ;
	public Course addCourse( Course obj) ;
	public Course updateCourse( Course obj) ;
	public void deleteCourse( long cid) ;

}
