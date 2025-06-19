package com.devmaster.userdpt.repositories;

import com.devmaster.userdpt.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRespository extends JpaRepository<Department, Long> {
}
