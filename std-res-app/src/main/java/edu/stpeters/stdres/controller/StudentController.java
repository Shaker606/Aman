package edu.stpeters.stdres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.stpeters.stdres.entity.Student;
import edu.stpeters.stdres.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService stuSer;

	@PostMapping("/Stpeters/college/student/add")
	public String addNewStudent(@RequestBody Student stuData) {
		
		
		stuSer.saveStudentNewRecord(stuData);

		return "successfully added new record---->";
	}
}
