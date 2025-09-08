package com.aula.JpaRepository.repositories;

import com.aula.JpaRepository.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT obj FROM User obj WHERE obj.salary >= :minSalary AND obj.salary <= :maxSalary")
    Page<User> searchBySalary(Double minSalary, Double maxSalary, Pageable pageable);

    @Query("SELECT obj FROM User obj WHERE LOWER(obj.name) LIKE LOWER(CONCAT('%',:name,'%'))")
    Page<User> searchByName(String name, Pageable pageable);

    Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);

    Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);

    //https://docs.spring.io/spring-data/jpa/docs/current-SNAPSHOT/reference/html/#jpa.query-methods
    //No link acima há a explicação, mas resumindo, findBySalaryBetween e
    // findByNameContainingIgnoreCase são consultas sql prontas do jpa, ou seja, não precisa @query
}
