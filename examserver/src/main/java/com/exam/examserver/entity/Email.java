package com.exam.examserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Email {

	@Id
	private int eId;
	private String mail;
	
	@ManyToOne
	private Student student;
}
