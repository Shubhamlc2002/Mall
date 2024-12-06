package com.slc.Smart.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(
	    generator = ObjectIdGenerators.PropertyGenerator.class,
	    property = "id")
public class Mall {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@OneToOne(mappedBy = "mall",cascade = CascadeType.ALL)
	@JsonManagedReference
	address adress;
	@OneToMany(mappedBy = "mall",cascade = CascadeType.ALL)
	@JsonManagedReference
	List<Staff> staff;
	@OneToMany(mappedBy = "mall",cascade = CascadeType.ALL)
	//@JsonManagedReference
	//@JsonBackReference
	List<coustomer> coustomer;
	@OneToMany(mappedBy = "mall",cascade = CascadeType.ALL)
	@JsonManagedReference
	List<product>product;
	

}
