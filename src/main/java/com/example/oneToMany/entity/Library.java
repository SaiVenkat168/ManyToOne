package com.example.oneToMany.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Library")
public class Library 
{
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	String book;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_id")
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Library(String book) {
		super();
		this.book = book;
	}

	public Library() {
		super();
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}
	
	
	
	
}
