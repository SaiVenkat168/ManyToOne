package com.example.oneToMany.entity;

import jakarta.persistence.*;
import java.util.*;
@Entity
@Table(name="Student")
public class Student 
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	String name;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "student")
	private List<Library> lib=new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Library> getLib() {
		return lib;
	}

	public void setLib(List<Library> lib) {
		this.lib = lib;
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Student() {
		super();
	}
	
	
	
}
