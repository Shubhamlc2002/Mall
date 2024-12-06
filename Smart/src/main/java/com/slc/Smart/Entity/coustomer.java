package com.slc.Smart.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id")
public class coustomer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int age;
	private String gender;
	private long ph_no;
	@ManyToOne
	//@JsonBackReference
	//@JsonManagedReference
	
	Mall mall;

}
