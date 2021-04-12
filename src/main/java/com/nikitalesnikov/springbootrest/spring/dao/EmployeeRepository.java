package com.nikitalesnikov.springbootrest.spring.dao;





import com.nikitalesnikov.springbootrest.spring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
public List<Employee> findAllByName(String name);
}
