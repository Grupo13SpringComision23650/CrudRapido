package com.example.CrudRapido2.controller;

import com.example.CrudRapido2.entity.Student;
import com.example.CrudRapido2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/students")
public class StudentController {
  @Autowired
  private StudentService studentService;

  @GetMapping
  public List<Student> getAll(){
    return studentService.getStudents();
  }
  @GetMapping("/{studentId}")
  public Optional<Student> getBId(@PathVariable("studentId") Long StudentId){
    return studentService.getStudent(StudentId);
  }
  @PostMapping
  public Student saveUpdate(@RequestBody Student student){
    studentService.saveOrUpdate(student);
    return student;
  }

  @DeleteMapping("/{studentId}")
  public void delete(@PathVariable("studentId") Long studentId){
    studentService.delete(studentId);
  }

}
