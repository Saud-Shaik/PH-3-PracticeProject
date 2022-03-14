package com.simplilearn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.simplilearn.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
