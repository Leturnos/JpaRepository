package com.aula.JpaRepository.repositories;

import com.aula.JpaRepository.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
