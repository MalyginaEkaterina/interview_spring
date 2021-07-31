package ru.geekbrains.interview_spring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.interview_spring.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByLogin(String login);

}