package com.slc.Smart.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class product {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private long id;
	private String name;
	private double price;
	@ManyToOne
	@JsonBackReference
	Mall mall;

}
