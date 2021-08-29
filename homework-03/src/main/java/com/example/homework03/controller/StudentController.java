package com.example.homework03.controller;

import com.example.homework03.model.Student;
import com.example.homework03.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> findAll(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping(value = "/students/{id}")
    public void deleteStudentById(@PathVariable int id){
         studentService.deleteById(id);
    }

    @GetMapping("/students/{id}")
    public Student findStudentById(@PathVariable int id){
      return  studentService.findById(id);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
       return studentService.updateOnDatabase(student);
    }


}
