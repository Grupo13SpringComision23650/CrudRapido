package com.example.CrudRapido2.service;

import com.example.CrudRapido2.entity.Student;
import com.example.CrudRapido2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
  @Autowired
  StudentRepository studentRepository;
// hacemos el Get hacemos una lista de estudiantes

  public List<Student> getStudents(){
    return studentRepository.findAll();
  }

// hacemos una lista de un estudiante por id, opcional

  public Optional<Student> getStudent(Long id){
    return studentRepository.findById(id);
  }

// servicio para guardar y actualizar
  public void saveOrUpdate(Student student){
    studentRepository.save(student);
  }
//servicio para borrar
  public void delete(Long id){
    studentRepository.deleteById(id);
  }
}
