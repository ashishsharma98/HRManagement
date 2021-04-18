package com.nagarro.hrmanagement.service;

import java.util.List;

import com.nagarro.hrmanagement.models.Employee;

public interface EmployeeService {

	 Employee fetchEmployeeById(int id) throws Exception;

	 List<Employee> fetchAllEmployees() throws Exception;

	 String addEmployees(Employee employee) throws Exception;

	 String updateEmployeeDetails(Employee object, long id)throws Exception;

	 String fetchAllEmployeesFile() throws Exception;
}
