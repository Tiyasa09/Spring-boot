package com.springrest.Springrst.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.Springrst.entity.Course;

public interface Dao extends JpaRepository<Course,Long>{
	

}
