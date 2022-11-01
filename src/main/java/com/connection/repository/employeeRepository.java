package com.connection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.connection.entities.Employeepayroll;

@Repository
public interface employeeRepository extends JpaRepository<Employeepayroll, Long> {

}
