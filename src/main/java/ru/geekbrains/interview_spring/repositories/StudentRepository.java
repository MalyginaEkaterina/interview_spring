package ru.geekbrains.interview_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.interview_spring.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
