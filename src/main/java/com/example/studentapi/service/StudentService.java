package com.example.studentapi.service;

import com.example.studentapi.entity.Student;
import com.example.studentapi.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public Student getStudent(Integer id){
        return studentRepo.findById(id).get();
    }

    public List<String> getAllBoys(){
        List<Student> studentList = studentRepo.findAll();
        studentList.forEach(System.out::println);////for test purpose
        return studentList.stream().filter(student -> student.getGender().equalsIgnoreCase("male")).map(Student::getFirstName).collect(Collectors.toList());
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public List<String> getAllGirls() {
        List<Student> studentList = studentRepo.findAll();
        return studentList.stream()
                .filter(student -> student.getGender()
                        .equalsIgnoreCase("female"))
                .map(Student::getFirstName).collect(Collectors.toList());
    }

    public Map<Double, String> getToppers(){
        List<Student> studentList = studentRepo.findAll();
        //toppers are those who get more than 90%
        Map<Double, String> myTooperList = studentList.stream()
                .filter(student -> student.getPercentage() >= 90)
                .collect(Collectors.toMap(Student::getPercentage, student -> student.getFirstName() + " " + student.getLastName()));
        return  myTooperList;
    }
}
