package com.example.Springdemo.service;

import com.example.Springdemo.dto.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        Student Siri = new Student(1,"Siri", 22, LocalDate.of(1998, 12, 31), "siri@gmail.com");
        Student Srikanth = new Student(2,"Srikanth", 25, LocalDate.of(1996, 6, 6), "srk@gmail.com");
        return List.of(Siri,Srikanth);
    }
}
