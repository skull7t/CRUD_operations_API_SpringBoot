package com.xadmin.SpringCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringCrud.bean.Subject;
import com.xadmin.SpringCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subrepo;
	public List<Subject>getSubject(){
		
		List<Subject> subjects = new ArrayList<>();
		subrepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	//Create a Object in db
	public void addSubect(Subject subject) {
		// TODO Auto-generated method stub
		subrepo.save(subject);
	}

	public void updateSubject(String id,Subject subject) {
		// TODO Auto-generated method stub
		subrepo.save(subject);
	}

	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		subrepo.deleteById(id);
	}

}
