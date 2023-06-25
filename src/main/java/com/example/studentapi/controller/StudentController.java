package com.example.studentapi.controller;

import com.example.studentapi.entity.Student;
import com.example.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.soap.Addressing;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("student-api")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/msg", method = RequestMethod.POST)
    public String getMsg(){
        return "Hello ";
    }

    @GetMapping("getStudentById/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return studentService.getStudent(id);
    }



    @GetMapping("getListOfBoys")
    public List<String> getAllBoys(){
       return studentService.getAllBoys();

    }
    ///          localhost:8585/student-api/getListOfBoys

    @GetMapping("getListOfGirls")
    public List<String> getAllGirls(){
        return studentService.getAllGirls();
    }
    ///          localhost:8585/student-api/getListOfGirls
    @GetMapping("getToppersList")
    public Map<Double, String> getToppers(){
        return studentService.getToppers();
    }
    ///          localhost:8585/student-api/getToppersList
    @GetMapping("getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    ///          localhost:8585/student-api/getAllStudents
}
