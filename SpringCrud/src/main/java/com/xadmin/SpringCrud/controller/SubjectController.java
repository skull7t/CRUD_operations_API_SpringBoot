package com.xadmin.SpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringCrud.bean.Subject;
import com.xadmin.SpringCrud.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	public SubjectService subserv;

	@RequestMapping("/subjects")
	public List<Subject> getSubjects(){
		
		return subserv.getSubject();
		
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/subjects")
	public void addSubject(@RequestBody Subject subject) {
		subserv.addSubect(subject);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/subjects/{id}" )
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
		subserv.updateSubject(id,subject);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/subjects/{id}")
	public void deleteSubject(@PathVariable String id) {
		subserv.deleteSubject(id);
	}
}
