package io.bestcoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.bestcoder.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
