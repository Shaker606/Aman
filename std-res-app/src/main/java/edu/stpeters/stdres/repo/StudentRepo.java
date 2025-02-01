package edu.stpeters.stdres.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.stpeters.stdres.entity.Student;

public interface StudentRepo
	extends JpaRepository<Student, String>{

}
