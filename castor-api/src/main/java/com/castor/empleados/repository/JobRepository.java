package com.castor.empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.castor.empleados.entity.Job;

public interface JobRepository extends JpaRepository<Job, Long>{

}
