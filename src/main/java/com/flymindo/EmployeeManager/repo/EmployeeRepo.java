package com.flymindo.EmployeeManager.repo;

import com.flymindo.EmployeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    @Transactional
    void deleteEmployeeById(long id);

    Optional<Employee> findEmployeeById(long id);
}
