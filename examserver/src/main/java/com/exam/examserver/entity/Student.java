package com.exam.examserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	
	@OneToMany
	private List<Email> emails = new ArrayList<>();
}
