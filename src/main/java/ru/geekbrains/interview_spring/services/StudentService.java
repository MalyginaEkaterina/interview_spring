package ru.geekbrains.interview_spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.interview_spring.model.Student;
import ru.geekbrains.interview_spring.repositories.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    public Student addOrUpdate(Student student) {
        return studentRepository.save(student);
    }

    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
