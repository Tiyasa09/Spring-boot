package com.springrest.Springrst.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Springrst.dao.Dao;
import com.springrest.Springrst.entity.Course;
@Service
public class ServiceImpl implements ServiceDemo {
	@Autowired
	private Dao dao;
//	List<Course> list;
	public ServiceImpl() {
		//list =new ArrayList<>();
		//list.add(new Course(111,"java","for basic java"));
		//list.add(new Course(222,"python","for basic python"));
		//list.add(new Course(333,"c++","for basic c++"));
	}
	@Override
	public List<Course> getCourses(){
	//	return list;
		return dao.findAll();
	}
	@Override
	public Course singleCourse(long cid) {
	//	Course course=null;
		//for(Course c:list) {
		//	if(c.getId()==cid) {
			//	course=c;
			//	break;
			//}
		//}
		//return course;
		return dao.getOne(cid);
	}
	@Override
	public Course addCourse(Course obj) {
		// list.add(obj);
		// return obj;
		dao.save(obj);
		return obj;
	}
	
	@Override
	public Course updateCourse(Course obj) {
		// list.add(obj);
		// return obj;
		// list.forEach(up-> {
			// if(up.getId()==obj.getId()) {
				// up.setTitle(obj.getTitle());
				//	 up.setDescription(obj.getDescription());
				// }
			// });
		// return obj;
		dao.save(obj);
		return obj;
		 }
	public void deleteCourse(long cid) {
		//list=this.list.stream().filter(del->del.getId()!=cid).collect(Collectors.toList());
		Course del=dao.getOne(cid);
		dao.delete(del);
		
		}
	}



