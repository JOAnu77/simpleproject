package com.client1.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client1.model.Student;

@RestController
public class HomeController 
{

	@RequestMapping("/")
	public String prelogin()
{
	return"Welcome Admission";
}

	@RequestMapping("getpro")
	public List getprodata()
	{
	Student s=new Student();
	s.setRollno(1);
	s.setName("Kalpana");
	s.setAddress("pune");
	
	List l=new ArrayList();
	l.add(s);
	
	return l;
		
	}

}

