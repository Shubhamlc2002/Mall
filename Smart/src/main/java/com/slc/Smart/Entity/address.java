package com.slc.Smart.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String village;
	private String tel;
	private String dist;
	private long Pin_code;
	@OneToOne
	@JsonBackReference
	Mall mall;

}
