package com.slc.Smart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slc.Smart.Entity.coustomer;
import com.slc.Smart.Repository.CoustomerRepository;

@RestController
@RequestMapping("cmr")
public class CoustomerConroller {
	@Autowired
	CoustomerRepository repo;
	@GetMapping
	public List<coustomer> cmr(){
		return repo.findAll();
		
	}

}
