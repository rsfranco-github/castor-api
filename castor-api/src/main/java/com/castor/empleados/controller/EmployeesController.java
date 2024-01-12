package com.castor.empleados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.castor.empleados.response.CastorAPIResponse;
import com.castor.empleados.service.EmployeesService;


@RestController
@RequestMapping("employees")
public class EmployeesController {
	
	@Autowired
	private EmployeesService service;
	
	@GetMapping("/findAll")
	public CastorAPIResponse view() {
		return service.findAll();
	}
	
	@GetMapping("/findByDocument/{document}")
	public CastorAPIResponse findByDocument(@PathVariable Long document ) {
		return service.findByDocument(document);
	}
	

}
