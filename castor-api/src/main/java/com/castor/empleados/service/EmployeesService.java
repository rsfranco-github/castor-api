package com.castor.empleados.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.castor.empleados.entity.Employee;
import com.castor.empleados.entity.Job;
import com.castor.empleados.repository.EmployeeRepository;
import com.castor.empleados.repository.JobRepository;
import com.castor.empleados.response.CastorAPIResponse;
import com.castor.empleados.util.Constants;
import com.castor.empleados.util.Utils;

import jakarta.transaction.Transactional;

@Service
public class EmployeesService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private JobRepository jobRepository;

	public CastorAPIResponse findAll() {

		CastorAPIResponse response = new CastorAPIResponse();
		response.setResponse(employeeRepository.findAll());

		return response;
	}

	public CastorAPIResponse findByDocument(Long document) {

		CastorAPIResponse response = new CastorAPIResponse();
		response.setResponse(employeeRepository.findByDocument(document));

		return response;
	}
	
	@Transactional
	public CastorAPIResponse save() {
		
		CastorAPIResponse response = new CastorAPIResponse();
		
		Job job=jobRepository.getReferenceById(3L);
		
		Employee employee=new Employee();
		employee.setDocument(109678953L);
		employee.setName("Juan Perez");
		employee.setAdmissionDate(Utils.parseDate("2024-01-12"));
		employee.setJob(job);
		
		employeeRepository.save(employee);
		
		
		response.setCode(Constants.HTTP_STATUS_201);
		response.setMessage(Constants.CREATED);

		return response;
		
	}

}
