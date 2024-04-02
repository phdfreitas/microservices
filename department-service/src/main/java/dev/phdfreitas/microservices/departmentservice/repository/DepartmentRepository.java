package dev.phdfreitas.microservices.departmentservice.repository;

import dev.phdfreitas.microservices.departmentservice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
