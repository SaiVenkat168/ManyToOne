package com.example.oneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.oneToMany.entity.Library;
import com.example.oneToMany.entity.Student;
import com.example.oneToMany.repo.LibraryRepo;
import com.example.oneToMany.repo.StudentRepo;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner 
{
	@Autowired
	StudentRepo lib;
	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		
		Library l=new Library("Wings of Fire");
		Library l1=new Library("Java for Beginners");
		Library l2=new Library("NCERT");
		Library l3=new Library("Rich Dad Poor Dad");
		
		Student s1=new Student("Arun");
		Student s2=new Student("Yash");
		
		s1.getLib().add(l1);
		
		s2.getLib().add(l2);
		s2.getLib().add(l3);
		s1.getLib().add(l);
		
		l1.setStudent(s1);
		l2.setStudent(s2);
		l.setStudent(s1);
		l3.setStudent(s2);
		
		lib.save(s1);
		lib.save(s2);
		
		
	}

}
