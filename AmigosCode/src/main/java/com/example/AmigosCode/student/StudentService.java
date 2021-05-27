package com.example.AmigosCode.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public void addStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException("email is taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        if(!studentRepository.existsById(id)) throw new IllegalStateException("No record in " + id + " id");
        studentRepository.deleteById(id);
    }

    public void updateStudent(Student student) {
        Student oldStudent = studentRepository.findById(student.getId()).orElseThrow(() -> new RuntimeException(String.format("Cannot find a student by ID %s", student.getId())));
        oldStudent.setName(student.getName());
        oldStudent.setEmail(student.getEmail());
        oldStudent.setDob(student.getDob());
        studentRepository.save(oldStudent);
    }
}
