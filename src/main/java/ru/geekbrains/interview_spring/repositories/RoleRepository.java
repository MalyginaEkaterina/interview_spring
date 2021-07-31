package ru.geekbrains.interview_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.interview_spring.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);

}