package com.student.spring_student.service;

//package com.example.studentdetails.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.student.spring_student.runner.Student;

@Service
public class StudentService {

    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    @Value("${student.course}")
    private String course;

    public Student getStudentDetails() {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);
        return student;
    }

	
}
