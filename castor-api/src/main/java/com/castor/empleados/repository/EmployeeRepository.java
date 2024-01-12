package com.castor.empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castor.empleados.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	Employee findByDocument(Long document);

}
