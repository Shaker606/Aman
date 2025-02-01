package edu.stpeters.stdres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.stpeters.stdres.entity.Student;
import edu.stpeters.stdres.repo.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo stuRepo;

	public void saveStudentNewRecord(Student stuData) {
		
		
		stuRepo.save(stuData);
 	
	}
 }

